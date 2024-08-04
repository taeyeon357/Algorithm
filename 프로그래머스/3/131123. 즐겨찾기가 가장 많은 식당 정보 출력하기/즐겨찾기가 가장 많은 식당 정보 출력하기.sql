-- 코드를 입력하세요
SELECT i.food_type, i.rest_id, i.rest_name, i.favorites
FROM rest_info i JOIN
    (
        SELECT food_type, max(favorites) as max_f
        FROM rest_info
        GROUP BY food_type
    ) m ON i.food_type = m.food_type AND i.favorites = m.max_f
ORDER BY i.food_type DESC