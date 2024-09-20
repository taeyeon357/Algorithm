-- 코드를 작성해주세요
SELECT c.fish_count, i.fish_name
FROM
    (
        SELECT fish_type, count(*) as FISH_COUNT
        FROM fish_info
        GROUP BY fish_type
    ) c LEFT JOIN fish_name_info i 
    ON c.fish_type = i.fish_type
ORDER BY c.fish_count DESC