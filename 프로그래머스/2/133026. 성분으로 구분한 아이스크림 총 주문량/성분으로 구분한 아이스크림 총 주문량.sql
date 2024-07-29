-- 코드를 입력하세요
SELECT i.ingredient_type, SUM(h.total_order) AS TOTAL_ORDER
FROM
    first_half h JOIN icecream_info i ON h.flavor = i.flavor
GROUP BY i.ingredient_type
ORDER BY TOTAL_ORDER