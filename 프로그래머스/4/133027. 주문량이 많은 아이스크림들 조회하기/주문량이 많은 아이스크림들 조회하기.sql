-- 코드를 입력하세요
SELECT b.flavor
FROM (
    SELECT a.flavor, sum(a.total_order) as total_order
    FROM
        (select * from july 
         union all 
         select * from first_half h
        ) a
    GROUP BY a.flavor
    ORDER BY total_order DESC
    limit 3
) b
    
    
    
/*
SELECT b.flavor
FROM (
    SELECT a.flavor, SUM(total_order) as total_order
    FROM (
        SELECT * FROM july
        UNION ALL
        SELECT * FROM first_half
    ) a
    GROUP BY a.flavor
    ORDER BY total_order DESC
    LIMIT 3
) b;


*/