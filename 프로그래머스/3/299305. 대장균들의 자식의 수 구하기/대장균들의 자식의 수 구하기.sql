-- 코드를 작성해주세요
SELECT a.id, IFNULL(b.count, 0) AS CHILD_COUNT
FROM ecoli_data a LEFT JOIN 
    (
        SELECT parent_id, count(*) AS count
        FROM ecoli_data
        WHERE parent_id IS NOT NULL
        GROUP BY parent_id
    ) b ON a.id = b.parent_id
ORDER BY a.id