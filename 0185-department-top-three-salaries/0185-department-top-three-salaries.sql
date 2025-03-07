# Write your MySQL query statement below
with cte as (
    select d.name as Department, e.name as Employee,(salary) as Salary
    from 
    Employee e 
    join 
    Department d 
    on e.departmentId=d.id
),second as (
    select Department,employee,salary,dense_rank() over( partition by department order by salary desc) as ran
    from cte
)
select department,employee,salary from second
where ran<=3;