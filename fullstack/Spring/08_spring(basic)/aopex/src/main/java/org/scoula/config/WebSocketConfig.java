package org.scoula.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer  {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // 구독시 사용할토픽접두어
        config.enableSimpleBroker("/topic");
        // 클라이언트가발행시사용해야하는접두어
        config.setApplicationDestinationPrefixes("/app");
    }
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat-app")  // 접속 엔드포인트, ws://localhost:8080/chat-app
                .setAllowedOrigins("*");
        // CORS 허용
    }
}
