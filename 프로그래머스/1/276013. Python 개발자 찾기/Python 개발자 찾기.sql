-- 코드를 작성해주세요
SELECT id, email, first_name, last_name
FROM developer_infos
WHERE 'Python' in (skill_1, skill_2, skill_3)
ORDER BY id ASC