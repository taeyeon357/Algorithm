-- 코드를 작성해주세요
select YEAR(differentiation_date) AS YEAR, y.max_size - o.size_of_colony AS YEAR_DEV, o.id AS ID
FROM ecoli_data o JOIN 
    (
        SELECT YEAR(differentiation_date) AS year, MAX(size_of_colony) AS max_size
        FROM ecoli_data
        GROUP BY year
    ) y
ON YEAR(differentiation_date) = y.year
ORDER BY year, year_dev