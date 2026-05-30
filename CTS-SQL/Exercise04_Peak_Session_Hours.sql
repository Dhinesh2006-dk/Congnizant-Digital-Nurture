SELECT Events.title,
       COUNT(Sessions.session_id)
       AS total_sessions
FROM Events
INNER JOIN Sessions
ON Events.event_id = Sessions.event_id
WHERE TIME(Sessions.start_time)
BETWEEN '10:00:00'
AND '12:00:00'
GROUP BY Events.event_id,
         Events.title;