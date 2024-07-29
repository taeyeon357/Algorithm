-- 코드를 입력하세요
SELECT DATE_FORMAT(datetime, '%H') AS HOUR, count(*) AS COUNT
FROM animal_outs
WHERE DATE_FORMAT(datetime, '%H') >= 09 AND DATE_FORMAT(datetime, '%H') < 20
GROUP BY HOUR
ORDER BY HOUR