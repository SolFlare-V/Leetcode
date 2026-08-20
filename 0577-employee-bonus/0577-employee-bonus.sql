# Write your MySQL query statement below
Select e.name, b.bonus 
FROM Employee e
LEFT JOIN Bonus as  b
ON e.empId = b.empId
where b.bonus<1000 or b.bonus is null
