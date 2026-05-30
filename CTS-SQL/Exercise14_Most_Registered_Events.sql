SELECT Events.title,
       COUNT(Registrations.registration_id)
       AS total_registrations
FROM Events
INNER JOIN Registrations
ON Events.event_id = Registrations.event_id
GROUP BY Events.event_id,
         Events.title
ORDER BY total_registrations DESC
LIMIT 3;