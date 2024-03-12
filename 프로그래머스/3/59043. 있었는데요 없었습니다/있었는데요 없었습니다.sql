-- 코드를 입력하세요
/*
SELECT
    i.animal_id, i.name
FROM
    animal_ins i JOIN animal_outs o
ON
    i.animal_id = o.animal_id
WHERE
    date_format(i.datetime, '%Y-%m-%d') > date_format(o.datetime, '%Y-%m-%d')
ORDER BY
    i.datetime ASC; 
*/


SELECT
    i.animal_id, i.name
FROM
    animal_ins i JOIN animal_outs o
ON
    i.animal_id = o.animal_id
WHERE
    i.datetime > o.datetime
ORDER BY
    i.datetime ASC