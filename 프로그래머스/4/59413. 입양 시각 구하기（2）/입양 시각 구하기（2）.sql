-- 코드를 입력하세요
/*SELECT DATE_FORMAT(datetime, '%h') AS HOUR, count(*) AS COUNT
FROM animal_outs
GROUP BY HOUR
ORDER BY HOUR
*/
WITH RECURSIVE cte AS(
    SELECT 0 AS NUM
    UNION ALL
    SELECT NUM+1 
    FROM cte
    WHERE NUM < 23
)

select a.num AS HOUR, IFNULL(b.COUNT, 0) AS COUNT
FROM 
    cte a 
        LEFT JOIN
    (
        SELECT 
            DATE_FORMAT(datetime, '%H') AS HOUR, 
            count(distinct animal_id) AS COUNT 
        FROM animal_outs
        GROUP BY HOUR
    ) b
    ON a.num = b.HOUR
ORDER BY HOUR

/*
with recursive hour_list as (
 select 0 as hour

 union all

 select hour + 1
   from hour_list
  where hour < 23
)

 select a.hour as "HOUR"
      , coalesce(b.cnt, 0) as "COUNT"
   from hour_list a
   left join (
             select hour(datetime) as hour
                  , count(distinct animal_id) as cnt
               from animal_outs 
              group by 1
             ) b
          on a.hour = b.hour
*/