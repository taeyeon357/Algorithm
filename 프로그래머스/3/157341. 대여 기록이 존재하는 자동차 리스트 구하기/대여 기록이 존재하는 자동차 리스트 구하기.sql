-- 코드를 입력하세요
SELECT distinct(c.car_id) as CAR_ID
FROM ( 
    car_rental_company_car c JOIN car_rental_company_rental_history h
    ON c.car_id=h.car_id
)
WHERE c.car_type = '세단' AND h.start_date like '%-10-%'
ORDER BY c.car_id DESC