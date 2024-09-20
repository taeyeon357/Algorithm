-- 코드를 입력하세요
SELECT 10000 * (price DIV 10000) AS price_group, count(*) AS products
FROM product
group by price_group
order by price_group
