use sqldb;

-- 1-1. 사용자별로 구매 이력을 출력함, 모든 컬럼을 출력함, 구매 이력이 없는 정보는 출력하지 않음
SELECT *
FROM buytbl b 
INNER JOIN usertbl u
	ON b.userID = u.userID;

-- 1-2. 앞의 결과에서 userID가 'JYP'인 데이터만 출력하세요
SELECT *
FROM buytbl b 
INNER JOIN usertbl u
	ON b.userID = u.userID
WHERE b.userID = 'JYP';

-- 2. 각 사용자별로 구매이력 출력, 연결 컬럼은 userID로 함, 결과를 userID를 기준으로 오름차순으로 정렬함
-- 구매이력이 없는 사용자도 출력, userID, name, prodName, addr, 연락처를 출력함
SELECT u.userID, u.name, b.prodName, u.addr, CONCAT(u.mobile1, u.mobile2) AS '연락처'
FROM usertbl u LEFT OUTER JOIN buytbl b
ON u.userID= b.userID
ORDER BY u.userID;

-- 3-1. sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.
SELECT name, CONCAT(mobile1, mobile2) AS '전화번호'
FROM usertbl
WHERE name NOT IN(
	SELECT name
    FROM usertbl
    WHERE mobile1 IS NULL
);
    
-- 3-2. sqldb의 사용자를 모두 조회하되 전화가 없는 사람만 출력하세요.
SELECT name, CONCAT(mobile1, mobile2) AS '전화번호'
FROM usertbl
WHERE name IN(
	SELECT name
    FROM usertbl
    WHERE mobile1 IS NULL
);
    