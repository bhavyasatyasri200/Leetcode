# Write your MySQL query statement below
WITH cte AS (
    SELECT managerId,COUNT(*) AS counter
    FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING counter >= 5
)
SELECT e.name
FROM Employee e
JOIN cte c ON e.id = c.managerId;
