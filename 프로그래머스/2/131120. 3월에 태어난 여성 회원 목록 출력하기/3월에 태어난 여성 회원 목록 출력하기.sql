-- 코드를 입력하세요
SELECT 
    MEMBER_ID,
    MEMBER_NAME, 
    GENDER, 
    DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH
FROM member_profile
WHERE 
    TLNO is not null 
AND 
    SUBSTRING(DATE_OF_BIRTH, 6,2) = '03'
AND 
    GENDER = 'W'
ORDER BY member_id;