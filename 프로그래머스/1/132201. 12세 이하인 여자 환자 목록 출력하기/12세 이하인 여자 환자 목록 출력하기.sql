-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(tlno, 'NONE') as TLNO
FROM patient
WHERE age <= 12 AND gend_cd = 'W'
ORDER BY 
    AGE DESC, PT_NAME;