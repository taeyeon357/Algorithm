-- 코드를 입력하세요
SELECT a.product_id, a.product_name, sum(a.amount * a.price) AS total_sales
FROM (  
    SELECT p.product_id, p.product_name, o.amount, p.price
    FROM food_order o JOIN food_product p 
    ON p.product_id=o.product_id
    WHERE o.produce_date like '2022-05-%'
) a
GROUP BY p.product_id, p.product_name
ORDER BY total_sales DESC, a.product_id ASC