-- 코드를 입력하세요
SELECT datetime AS 시간 FROM animal_ins
WHERE datetime = (SELECT MAX(datetime) FROM animal_ins);