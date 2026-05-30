SELECT Events.title,
       COUNT(Resources.resource_id)
       AS total_resources
FROM Events
INNER JOIN Resources
ON Events.event_id = Resources.event_id
GROUP BY Events.event_id,
         Events.title;