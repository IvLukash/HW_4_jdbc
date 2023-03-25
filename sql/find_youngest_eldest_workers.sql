SELECT 'youngest' AS type, name, birthday
FROM worker
WHERE birthday = (
    SELECT MAX(birthday)
    FROM worker
)
UNION
SELECT 'eldest' as type, name, birthday
FROM worker
WHERE birthday = (
    SELECT MIN(birthday)
    FROM worker
);