-- 설명(comment, 주석), 한 칸 반드시 띄워주alter

-- 현재 스키마(db)는 shopdb로 설정되어있음

show tables; -- 테이블 목록 보여주기

desc membertbl; -- 테이블 설정 자세히 보여주기 describe 

select * from membertbl; -- membertbl로 부터 모든 필드(항목, item, 속성, 컬럼) 선택해서 보여줘

-- dml 중 하나 crud 중에서 read에 속하는 select 문 실행
-- dml -> crud 작업 -> select문 제일 많이 사용

select memberID from membertbl; -- membertbl로 부터 모든 필드(항목, item, 속성, 컬럼) 선택해서 보여줘

select memberID, memberName from membertbl; -- membertbl로 부터 모든 필드(항목, item, 속성, 컬럼) 선택해서 보여줘

INSERT INTO memberTBL values ('summer','박길동', null);

select * from membertbl;

select * from membertbl where memberID = 'apple';

-- not null이면서 중복x 컬럼을 가지고 조건을 주어야지만 해당 사람에 대한 정보 검색 가능
-- 컬럼 중에서 중요한 역할을 하는 컬럼을 중요키,기본키, .. primary key, pk

