SELECT Users.full_name,
       Users.email,
       Users.registration_date
FROM Users
LEFT JOIN Registrations
ON Users.user_id = Registrations.user_id
WHERE Users.registration_date >= CURDATE() - INTERVAL 30 DAY
AND Registrations.registration_id IS NULL;