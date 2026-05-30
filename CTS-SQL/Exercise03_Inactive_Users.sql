SELECT Users.full_name,
       Users.email,
       Users.city
FROM Users
LEFT JOIN Registrations
ON Users.user_id = Registrations.user_id
AND Registrations.registration_date >=
DATE_SUB(CURDATE(), INTERVAL 90 DAY)
WHERE Registrations.registration_id IS NULL;