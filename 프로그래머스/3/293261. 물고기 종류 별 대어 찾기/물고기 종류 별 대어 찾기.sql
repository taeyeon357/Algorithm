-- 코드를 작성해주세요
SELECT t.id, t.fish_name, t.length
FROM 
    (
        SELECT i.id, i.fish_type, i.length, n.fish_name
        FROM fish_info i JOIN fish_name_info n ON i.fish_type = n.fish_type
    ) t
    JOIN
    (
        SELECT fish_type, MAX(length) as max_len
        FROM fish_info
        GROUP BY fish_type
    ) m ON t.fish_type = m.fish_type AND t.length = m.max_len
ORDER BY t.id