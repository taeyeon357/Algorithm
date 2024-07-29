-- 코드를 입력하세요
SELECT MCDP_CD, count(*) AS 5월예약건수
FROM appointment
WHERE DATE_FORMAT(apnt_ymd, '%m') = 5
GROUP BY MCDP_CD
ORDER BY 5월예약건수 ASC, MCDP_CD ASC 