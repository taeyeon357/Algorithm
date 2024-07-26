-- 코드를 입력하세요
SELECT count(*) as USERS
FROM user_info
WHERE age <=29 AND age >= 20 AND substring(joined, 1,4) = 2021

