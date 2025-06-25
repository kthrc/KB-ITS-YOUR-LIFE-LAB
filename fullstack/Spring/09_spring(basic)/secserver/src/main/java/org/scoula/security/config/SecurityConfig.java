package org.scoula.security.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@EnableWebSecurity
@Log4j2
/**
 * WebSecurityConfigurerAdapter
 * 우리가 작성한 Spring Security(보안) 설정을 Spring Security 필터 체인에 등록하여
 * 웹 애플리케이션 전반에 적용되도록 도와주는 추상 클래스
 * -> 자동으로 '/login'로 redirect
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 문자셋필터
    // post 방식의 전달 시 body에 들어있는 값 한글 인코딩 필터
    public CharacterEncodingFilter encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return encodingFilter;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // 필터체인 순서대로 해줘야 함
        // encodingFilter() -> CsrFilter
        http.addFilterBefore(encodingFilter(), CsrfFilter.class);

        /**
         * 경로별 접근권한설정
         *
         * authorizeRequests()에서 경로별 권한을 명시적으로 설정하면,
         * 해당 경로는 그 설정에 따라 접근 제어가 동작하고, (자동 redirect 사라짐)
         * 인증이 필요한 경로에만 '/login'로 redirect가 발생한다.
         *
         * /sercurity/all: 모두 접근 가능: all.jsp
         * /security/admin: admin인지 확인 불가 -> 403 error(금지됨)
         * /security/member: member인지 확인 불가 -> 403 error(금지됨)
         */
        //form-login 기본 설정은 비활성화되어서 사라짐
        http.authorizeRequests().antMatchers("/security/all").permitAll()
                .antMatchers("/security/admin").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/security/member").access("hasAnyRole('ROLE_MEMBER', 'ROLE_ADMIN')");

        // 권한이 없으면 403 에러 화면이 뜸.
        // -> 이 에러화면보다는 로그 페이지를 보여주는 것이 더 나을 것 같음.
        // --> 403 에러가 발생했을 때 form-login화면으로 다시 redirect!
        http.formLogin(); // form 기반 로그인 활성화, 나머지는 모두 디폴트

        // 로그인 페이지 커스텀
        http.formLogin()  // 로그인 설정 시작
                .loginPage("/security/login")  // 로그인 페이지 GET URL -> 'security/login' 뷰(jsp) 정의
                .loginProcessingUrl("/security/login")  // 로그인 POST URL -> login form의 action에 지정
                .defaultSuccessUrl("/");  // 로그인 성공 시 redirect할 페이지 (첫 페이지)

        http.logout()  // 로그아웃설정시작
                .logoutUrl("/security/logout")  // POST: 로그아웃 호출 url
                .invalidateHttpSession(true)  // 세션 invalidate
                .deleteCookies("remember-me", "JSESSION-ID")  // 삭제할 쿠키 목록
                .logoutSuccessUrl("/security/logout");  // GET: 로그아웃 이후이동할페이지

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        log.info("configure .........................................");
        auth.inMemoryAuthentication()
                .withUser("admin")
//                .password("{noop}1234")
                // 해시코드값 - 암호화해서 DB에 넣으면 관리자도 '1234'라는 것을 모름
                // -> 'matches' 함수를 통해 확인
                .password("$2a$10$a7J5oZT0YUt0Je8TovMJfOxgffJqef1oFy/1DLGiLyO7j4umKl2GW")
                .roles("ADMIN", "MEMBER"); // ROLE_ADMIN
        auth.inMemoryAuthentication()
                .withUser("member")
//                .password("{noop}1234")
                .password("$2a$10$a7J5oZT0YUt0Je8TovMJfOxgffJqef1oFy/1DLGiLyO7j4umKl2GW")
                .roles("MEMBER"); // ROLE_MEMBER
    }
}