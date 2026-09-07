# Write your MySQL query statement below
SELECT 
Person.firstname,
Person.lastname,
Address.city,
Address.state
FROM person LEFT JOIN Address ON Address.personId=Person.personId;