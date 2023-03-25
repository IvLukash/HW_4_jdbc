SELECT client.name, COUNT(project.id) AS project_count
FROM client
JOIN project ON client.id=project.client_id
GROUP BY client.name
HAVING COUNT(project.id) = (
    SELECT COUNT (id)
    FROM project
    GROUP BY client_id
    ORDER BY count(id) DESC
    LIMIT 1
);