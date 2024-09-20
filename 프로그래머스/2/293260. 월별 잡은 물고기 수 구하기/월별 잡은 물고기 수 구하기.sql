-- 코드를 작성해주세요
SELECT count(*) as fish_count, MONTH(time) as month
FROM fish_info
GROUP BY month
ORDER BY month