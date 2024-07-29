-- 코드를 입력하세요
SELECT  animal_id, name
FROM animal_ins
WHERE name like '%el%' AND animal_type = 'Dog'
ORDER BY name