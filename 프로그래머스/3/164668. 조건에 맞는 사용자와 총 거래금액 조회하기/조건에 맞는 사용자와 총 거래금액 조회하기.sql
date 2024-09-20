-- 코드를 입력하세요
SELECT u.user_id, u.nickname, t.total_sales
FROM (
        SELECT writer_id, sum(price) AS total_sales
        FROM used_goods_board
        WHERE status='DONE'
        GROUP BY writer_id
) t JOIN used_goods_user u on t.writer_id = u.user_id
WHERE t.total_sales >=700000
ORDER BY t.total_sales