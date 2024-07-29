-- 코드를 입력하세요
SELECT i.animal_id, i.name
FROM 
    animal_ins i JOIN animal_outs o 
    ON i.animal_id = o.animal_id
ORDER BY o.datetime - i.datetime desc
limit 2