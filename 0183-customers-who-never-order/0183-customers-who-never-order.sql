# Write your MySQL query statement below
select name As Customers 
from Customers
where id Not in(
    select customerId
    from Orders
)