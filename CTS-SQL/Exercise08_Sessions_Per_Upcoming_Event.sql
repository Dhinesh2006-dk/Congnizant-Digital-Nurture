SELECT Events.title,
       COUNT(Sessions.session_id)
       AS total_sessions
FROM Events
INNER JOIN Sessions
ON Events.event_id = Sessions.event_id
WHERE Events.status = 'upcoming'
GROUP BY Events.event_id,
         Events.title;