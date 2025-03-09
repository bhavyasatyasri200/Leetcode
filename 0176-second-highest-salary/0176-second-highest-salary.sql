# Write your MySQL query statement below
WITH cte AS (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk 
    FROM Employee
)
SELECT COALESCE(
    (SELECT salary FROM cte WHERE rnk = 2 LIMIT 1), 
    NULL
) AS SecondHighestSalary;


