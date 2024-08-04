-- 코드를 입력하세요
SELECT MONTH(start_date) AS MONTH, car_id, count(*) AS records
FROM 
    car_rental_company_rental_history
WHERE 
    car_id in
    (
        SELECT car_id
        FROM car_rental_company_rental_history
        WHERE 
            start_date >= "2022-08-01" AND  
            start_date <= "2022-10-31"
        GROUP BY car_id
        HAVING count(*) >= 5
    )
AND 
    start_date >= "2022-08-01" AND  
    start_date <= "2022-10-31"
GROUP BY MONTH, car_id
ORDER BY MONTH, car_id DESC