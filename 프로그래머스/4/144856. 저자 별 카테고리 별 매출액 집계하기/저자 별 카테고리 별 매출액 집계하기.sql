-- 코드를 입력하세요
SELECT a.author_id, a.author_name, t.category, sum(t.total_sales) as total_sales
FROM author a JOIN
    (
        SELECT b.book_id, b.category, b.author_id, sum(b.price*s.sales) as total_sales
        FROM
            book b JOIN book_sales s ON b.book_id = s.book_id
        WHERE DATE_FORMAT(s.sales_date, "%Y-%m") = '2022-01'
        GROUP BY book_id
    ) t ON a.author_id = t.author_id
GROUP BY a.author_id, t.category
ORDER BY a.author_id, t.category DESC