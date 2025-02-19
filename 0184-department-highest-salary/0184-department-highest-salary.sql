# Write your MySQL query statement below
-- select d.name as Department,e.name as Employee,e.salary as Salary
-- from 
-- Employee e
-- join Department d
-- on e.departmentId=d.id
-- having e.salary=(select max(salary ) from Employee group by departmentId);

SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE e.salary = (
    SELECT MAX(salary) 
    FROM Employee 
    WHERE departmentId = e.departmentId
);


