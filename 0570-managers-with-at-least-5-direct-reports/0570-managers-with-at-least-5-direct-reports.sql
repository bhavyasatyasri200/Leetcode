# Write your MySQL query statement below
with cte as (
    select managerid,COUNT(*) as counter
    from employee
    where managerid is not null
    group by managerid
    having counter >= 5
)
select e.name
from employee e
join cte c on e.id = c.managerid;
