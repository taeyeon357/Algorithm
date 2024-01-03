-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, substring(DATE_OF_BIRTH, 1,10)
FROM MEMBER_PROFILE
WHERE GENDER = 'W' and substring(DATE_OF_BIRTH, 6,2) = '03' and TLNO is not null;