USE sqldb;

-- 문제 1-1 (사용자 아이디, 총 구매 개수)
SELECT userID AS '사용자 아이디', sum(amount) AS '총 구매 개수'
FROM buytbl
GROUP BY userID
ORDER BY userID asc;

-- 문제 1-2 (사용자 아이디, 총 구매액)
SELECT userID AS '사용자 아이디', sum(price * amount) AS '총 구매액'
FROM buytbl
GROUP BY userID
ORDER BY userID asc;


-- 문제 2-1 (평균 구매 개수)
SELECT AVG(amount) AS '평균 구매 개수'
FROM buytbl;

-- 문제 2-2 (userID, 평균 구매 개수)
SELECT userID, AVG(amount) AS '평균 구매 개수'
FROM buytbl
GROUP BY userID;


-- 문제 3 가장 키가 큰 사람과 가장 키가 작은 사람을 출력함
SELECT name, height
FROM usertbl
WHERE height = (SELECT MAX(height) FROM usertbl ) 
	OR height = (SELECT MIN(height) FROM usertbl);
    
    
-- 문제 4 휴대폰이 있는 사용자
SELECT COUNT(mobile1) AS '휴대폰이 있는 사용자'
FROM usertbl;


-- 문제 5-1 사용자별 총 구매액을 출력하세요
SELECT userID AS '사용자 아이디', sum(price * amount) AS '총 구매액'
FROM buytbl
GROUP BY userID
ORDER BY userID asc;

-- 문제 5-2 총 구매액이 1,000 이상인 사용자만 출력하세요
SELECT userID AS '사용자 아이디', sum(price * amount) AS '총 구매액'
FROM buytbl
GROUP BY userID
HAVING(SUM(price * amount) > 1000);

-- 문제 6-1 city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 총합
USE world;

SELECT SUM(Population)
FROM city
WHERE CountryCode = 'KOR';

-- 문제 6-2 city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최소값을 구하시오. 
-- 단 결과를 나타내는 테이블의 필드는 "최소값"으로 표시하시오.
SELECT MIN(Population)
FROM city
WHERE CountryCode = 'KOR';

-- 문제 6-3 city 테이블에서 국가코드가 'KOR'인 도시들의 평균을 구하시오
SELECT AVG(Population)
FROM city
WHERE CountryCode = 'KOR';

-- 문제 6-4 city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최대값을 구하시오.
-- 단 결과를 나타내는 테이블의 필드는 "최대값"으로 표시하시오
SELECT MAX(Population) AS '최대값'
FROM city
WHERE CountryCode = 'KOR';

-- 문제 6-5 country 테이블 각 레코드의 Name 칼럼의 글자수를 표시하시오
SELECT LENGTH(Name)
FROM country;

-- 문제 6-6 country 테이블의 나라명(Name 칼럼)을 앞 세글자만 대문자로 표시하시오
SELECT UPPER(MID(Name, 1, 3))
FROM country;

-- 문제 6-7 country 테이블의 기대수명(LifeExpectancy)을 소수점 첫째자리에서 반올림해서 표시하시오
SELECT Name AS '이름', ROUND(LifeExpectancy, 1) AS '기대수명'
FROM country;


-- 문제 7-1 employees db에서 각 부서별 관리자를 출력하세요(현 재직자만 출력)
USE employees;

SELECT *
FROM dept_manager
WHERE to_date = '9999-01-01';

-- 문제 7-2 부서번호 d005 부서의 현재 관리자 정보를 출력
SELECT *
FROM employees
WHERE emp_no = (
	SELECT emp_no
    FROM dept_manager
    WHERE to_date = '9999-01-01' AND dept_no = 'd005'
);


-- 문제 8 employees 테이블에서 페이지네이션으로 페이지를 추출하려고 한다. (입사일을 내림차순으로 정렬, 한 페이지당 20명의 정보 출력)
SELECT * 
FROM employees
ORDER BY hire_date DESC
LIMIT 140, 20;


-- 문제 9-1 employees db에서 재직자의 총 수를 구하시오
SELECT COUNT(*)
FROM dept_emp
WHERE to_date = '9999-01-01';

-- 문제 9-2 employees db에서 재직자의 평균 급여를 출력하시오 
SELECT AVG(salary)
FROM salaries
WHERE to_date = '9999-01-01';

-- 문제 10 재직자 전체 평균 급여보다 급여를 더 많이 받는 재직자 출력하시오
SELECT *
FROM salaries
WHERE to_date = '9999-01-01'
	AND salary > (
		SELECT AVG(salary)
        FROM salaries
        WHERE to_date = '9999-01-01'
);

-- 문제 11 employees db에서 각 부서별 재직자의 수를 구하시오
SELECT dept_no, COUNT(*)
FROM dept_emp
WHERE to_date = '9999-01-01'
GROUP BY dept_no
ORDER BY dept_no;
