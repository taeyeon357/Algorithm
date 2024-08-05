-- 코드를 입력하세요
SELECT animal_id, name
FROM animal_outs
WHERE animal_id not in (select animal_id from animal_ins)
ORDER BY animal_id