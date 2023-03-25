SELECT id AS name, DATEDIFF(month, start_date, finish_date) AS month_count  
FROM project
GROUP BY name, month_count
HAVING month_count = (
    SELECT MAX(DATEDIFF(month, start_date, finish_date))
    FROM project
);