-- productTBL의 데이터를 출력하세요
SELECT * FROM shopdb.productTBL;

-- memberTBL의 데이터를 출력하세요
SELECT * FROM membertbl;

-- memberTBL의 데이터를 출력하세요
-- 단, memberName과 memberAddress만 출력
SELECT memberName, memberAddress FROM membertbl;

-- memberTBL의 데이터 중 이름이 '지운이'인 데이터 출력
SELECT * FROM memberTBL where memberName='지운이';