-- 코드를 입력하세요
SELECT 
    u.user_id, u.nickname, 
    concat(u.city, ' ', u.street_address1, ' ', u.street_address2) AS 전체주소, 
    concat(substring(u.tlno, 1, 3), '-', substring(u.tlno, 4, 4), '-', substring(u.tlno, 8, 4)) AS 전화번호
FROM
    (
        SELECT 
            writer_id, count(*) as cnt
        FROM 
            used_goods_board
        GROUP BY 
            writer_id
        HAVING cnt > 2
    ) c JOIN used_goods_user u 
    ON c.writer_id = u.user_id
ORDER BY u.user_id DESC