#

-- SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
-- FROM Employee e
-- JOIN Department d ON e.departmentId = d.id
-- WHERE e.salary = (
--     SELECT MAX(salary) 
--     FROM Employee 
--     WHERE departmentId = e.departmentId
-- );
with cte as 
(select d.name as Department,e.name As Employee,e.salary As Salary,max(salary) over (partition by d.name) as max_salary
From Employee e
join 
Department d on e.departmentId=d.id)
select Department,Employee,Salary from cte where salary=max_salary;

