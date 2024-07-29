-- 코드를 입력하세요
/*
SELECT 
    animal_id, name, if(sex_upon_intake LIKE '%Neutered%' OR sex_upon_intake LIKE '%Spayed%', 'O', 'X') AS 중성화
FROM animal_ins
ORDER BY animal_id
*/
SELECT 
    animal_id,
    name,
    (case
     when sex_upon_intake LIKE '%Neutered%' then 'O'
     when sex_upon_intake LIKE '%Spayed%' then 'O'
     else 'X' end) as 중성화
FROM
    animal_ins
ORDER BY animal_id