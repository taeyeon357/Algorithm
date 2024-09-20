-- 코드를 작성해주세요
SELECT d.dept_id, d.dept_name_en, a.avg_sal
FROM
    (
        SELECT dept_id, ROUND(AVG(sal)) AS avg_sal
        FROM hr_employees 
        GROUP BY dept_id
    ) a JOIN hr_department d ON d.dept_id=a.dept_id
ORDER BY a.avg_sal DESC