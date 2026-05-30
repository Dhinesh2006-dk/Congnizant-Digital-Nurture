SELECT Users.full_name,
       Events.status,
       COUNT(Events.event_id)
       AS total_events
FROM Users
INNER JOIN Events
ON Users.user_id = Events.organizer_id
GROUP BY Users.full_name,
         Events.status;