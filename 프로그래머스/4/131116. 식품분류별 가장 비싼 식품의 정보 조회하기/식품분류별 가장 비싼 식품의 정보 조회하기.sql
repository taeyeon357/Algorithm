-- 코드를 입력하세요
SELECT p.category, m.max_price, p.product_name
FROM food_product p JOIN
    (
        SELECT category, max(price) as max_price
        FROM food_product
        WHERE category in ('과자', '국', '김치', '식용유')
        GROUP BY category
    ) m ON p.category = m.category AND p.price = m.max_price
ORDER BY m.max_price DESC