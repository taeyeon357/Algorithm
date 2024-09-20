-- 코드를 입력하세요
SELECT 
board_id, writer_id, title, price,
case 
when status = 'sale' then '판매중'
when status = 'reserved' then '예약중'
when status = 'done' then '거래완료'
end AS status
FROM used_goods_board
WHERE created_date = '2022-10-05'
ORDER BY board_id DESC