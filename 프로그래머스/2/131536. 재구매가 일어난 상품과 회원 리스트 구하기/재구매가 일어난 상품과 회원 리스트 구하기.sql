-- 코드를 입력하세요
SELECT 
    a.user_id, a.product_id
FROM
    (
        SELECT
            count(*) as cnt, user_id, product_id
        FROM
            online_sale
        GROUP BY 
            user_id, product_id
    ) a
WHERE
    a.cnt > 1
ORDER BY
    a.user_id ASC, a.product_id DESC;
