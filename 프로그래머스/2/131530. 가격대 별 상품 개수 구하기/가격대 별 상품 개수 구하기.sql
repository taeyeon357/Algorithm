-- 코드를 입력하세요
SELECT 10000*(price div 10000) as price_group, count(*) AS products
FROM product
GROUP BY price_group
ORDER BY price_group