-- 코드를 입력하세요
SELECT i.animal_id, i.animal_type, i.name
FROM 
    animal_ins i JOIN animal_outs o ON i.animal_id = o.animal_id
WHERE
    i.sex_upon_intake LIKE '%Intact%' AND (o.sex_upon_outcome LIKE '%Spayed%' OR o.sex_upon_outcome LIKE '%Neutered%')
ORDER BY i.animal_id