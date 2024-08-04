-- 코드를 입력하세요
SELECT 
    i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, 
    IFNULL(round(AVG(r.review_score), 2),0) AS score
FROM REST_INFO i
JOIN REST_REVIEW r ON i.rest_id = r.rest_id 
WHERE address LIKE "서울%"
GROUP BY i.rest_id
ORDER BY score DESC, i.favorites DESC