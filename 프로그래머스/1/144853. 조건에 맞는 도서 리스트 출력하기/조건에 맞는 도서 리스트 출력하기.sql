-- 코드를 입력하세요
SELECT book_id, DATE_FORMAT(published_date, '%Y-%m-%d') as published_date
FROM book
WHERE category='인문'
AND SUBSTRING(published_date, 1,4)='2021';