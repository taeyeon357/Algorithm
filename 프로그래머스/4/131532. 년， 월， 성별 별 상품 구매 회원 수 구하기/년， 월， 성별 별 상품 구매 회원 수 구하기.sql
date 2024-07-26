-- 코드를 입력하세요

SELECT date_format(s.sales_date, '%Y') AS YEAR, date_format(s.sales_date, '%m') AS month ,u.gender AS GENDER, count(distinct(s.user_id)) as USERS
FROM user_info u, online_sale s
WHERE u.user_id = s.user_id
GROUP BY YEAR, MONTH, GENDER
HAVING u.gender is not null
ORDER BY YEAR, MONTH, GENDER