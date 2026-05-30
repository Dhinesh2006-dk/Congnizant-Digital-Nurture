SELECT Events.city,
       AVG(Feedback.rating) AS average_rating
FROM Events
INNER JOIN Feedback
ON Events.event_id = Feedback.event_id
GROUP BY Events.city;