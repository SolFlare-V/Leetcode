# Write your MySQL query statement below
Select p.lastname, p.firstName, a.city, a.state From Person as p left join Address as a
on p.personId = a.personID;