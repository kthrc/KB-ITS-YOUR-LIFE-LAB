-- 1. sqldb에서 usertbl 테이블에서 다음 내용들을 확인하세요
USE sqldb;

-- usertbl의 내용 확인 
SELECT * FROM usertbl;

-- usertbl의 인덱스 목록 확인
SHOW INDEX FROM usertbl;

-- usertbl의 데이터 크기와 인덱스의 크기 확인
SHOW TABLE STATUS LIKE 'usertbl';

-- 2. usertbl의 addr 컬럼에 대해 idx_usertbl_addr이름으로 인덱스를 만들고,
-- 인덱스 목록을 확인하세요.

-- addr 컬럼에 인덱스 만들기
CREATE INDEX idx_usertbl_addr
	ON usertbl(addr);
    
SHOW INDEX FROM usertbl;

-- 3. usertbl의 상태를 출력하여 인덱스의 내용이 만들어졌는지 확인하고,
-- 내용이 없다면 실제 적용되도록 한 후, 인덱스의 크기를 확인하세요.

-- 인덱스 크기 확인
SHOW TABLE STATUS LIKE 'usertbl';  -- Index_length가 0

-- 생성한 인덱스를 실제 적용하려면 ANALYZE TABLE 문으로 먼저 테이블을 분석/처리해줘야 함
ANALYZE TABLE usertbl;

SHOW TABLE STATUS LIKE 'usertbl'; 

-- 4. usertbl에 대해 다음을 처리하세요.
-- 출생년도(birthYear)에 보조 인덱스 생성
CREATE UNIQUE INDEX idx_usertbl_birthYear
	ON usertbl(birthYear);
    
-- 중복값이 있어 인덱스 생성 에러 발생

-- 이름(name)에 보조 인덱스 생성
CREATE UNIQUE INDEX idx_usertbl_name
	ON usertbl(name);
    
SHOW INDEX FROM usertbl;

-- 5. usertbl에 대해 다음을 처리하세요.
-- 이름(name)에 보조 인덱스 삭제
DROP INDEX idx_usertbl_name 
	ON usertbl;
    
-- name, birthYear 조합으로 인덱스 생성
CREATE UNIQUE INDEX idx_usertbl_name_birthYear
	ON usertbl(name, birthYear);

SHOW INDEX FROM usertbl;

-- 6. usertbl에서 앞에서 만든 인덱스를 삭제하세요.
-- 인덱스 삭제
SHOW INDEX FROM usertbl;
DROP INDEX idx_usertbl_addr ON usertbl;
DROP INDEX idx_usertbl_name_birthYear ON usertbl;

-- 7. 다음과 같이 실습 데이터베이스 및 사용자를 생성하고, 
-- 해당 데이터베이스에 대해 모든 권한을 부여하세요.
-- 데이터베이스 명 : scoula_db
-- 사용자 명: scoula
-- 비밀번호: 1234
-- 접속 호스트: 제한 없음

-- 1. 데이터베이스 생성
CREATE DATABASE scoula_db;
-- 2. 사용자 생성 (비밀번호는 '1234', 호스트는 '%'로 제한 없음)
CREATE USER 'scoula'@'%' IDENTIFIED BY '1234';
-- 3. 권한 부여 (scoula_db 데이터베이스에 대해 모든 권한)
GRANT ALL PRIVILEGES ON scoula_db.* TO 'scoula'@'%';
-- 4. 권한 변경사항 적용
FLUSH PRIVILEGES;
    
    