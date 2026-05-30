SELECT Events.title,
       AVG(
           TIMESTAMPDIFF(
               MINUTE,
               Sessions.start_time,
               Sessions.end_time
           )
       ) AS average_duration_minutes
FROM Events
INNER JOIN Sessions
ON Events.event_id = Sessions.event_id
GROUP BY Events.event_id,
         Events.title;
         