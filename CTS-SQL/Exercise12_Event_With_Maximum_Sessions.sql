SELECT Events.title,
       COUNT(Sessions.session_id) AS total_sessions
FROM Events
INNER JOIN Sessions
ON Events.event_id = Sessions.event_id
GROUP BY Events.event_id, Events.title
HAVING COUNT(Sessions.session_id) =
(
    SELECT MAX(session_count)
    FROM
    (
        SELECT COUNT(session_id) AS session_count
        FROM Sessions
        GROUP BY event_id
    ) AS SessionCounts
);