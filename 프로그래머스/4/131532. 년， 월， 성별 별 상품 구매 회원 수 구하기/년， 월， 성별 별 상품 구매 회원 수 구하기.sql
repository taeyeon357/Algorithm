-- 코드를 입력하세요
SELECT 
    DATE_FORMAT(o.sales_date, '%Y') AS YEAR,
    DATE_FORMAT(o.sales_date, '%m') AS MONTH, 
    u.gender,
    count(distinct o.user_id) AS USERS
FROM 
    user_info u JOIN online_sale o ON u.user_id = o.user_id
WHERE 
    u.gender is not null
GROUP BY YEAR, MONTH, u.gender 
ORDER BY YEAR, MONTH, u.gender ASC