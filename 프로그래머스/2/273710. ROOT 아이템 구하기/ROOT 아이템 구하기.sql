-- 코드를 작성해주세요
SELECT item_id, item_name
FROM item_info
WHERE item_id in (SELECT item_id FROM item_tree WHERE parent_item_id is NULL)
ORDER BY item_id