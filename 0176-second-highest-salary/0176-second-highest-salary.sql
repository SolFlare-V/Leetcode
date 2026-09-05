# Write your MySQL query statement below
Select max(salary) as SecondHighestSalary From Employee
Where Salary < (Select max(salary) from Employee);