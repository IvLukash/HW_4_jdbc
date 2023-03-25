SELECT project.id AS name, SUM (salary * DATEDIFF('month', start_date, finish_date)) AS price
FROM project
JOIN project_worker ON project_worker.project_id = project.id
JOIN worker ON worker.id = project_worker.worker_id
GROUP BY project.id
ORDER BY price DESC;