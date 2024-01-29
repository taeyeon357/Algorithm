-- 코드를 입력하세요
SELECT price as MAX_PRICE from product
where price = (select max(price) from product);