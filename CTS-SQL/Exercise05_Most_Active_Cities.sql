SELECT Users.city,
       COUNT(DISTINCT Users.user_id)
       AS total_registered_users
FROM Users
INNER JOIN Registrations
ON Users.user_id = Registrations.user_id
GROUP BY Users.city
ORDER BY total_registered_users DESC
LIMIT 5;