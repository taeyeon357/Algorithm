-- 코드를 입력하세요
SELECT b.category, sum(s.sales) as total_sales
FROM book b JOIN book_sales s ON b.book_id = s.book_id
WHERE DATE_FORMAT(s.sales_date, '%y-%m') = '22-01'
GROUP BY b.category
ORDER BY b.category