SELECT Events.title,
       AVG(Feedback.rating) AS average_rating,
       COUNT(Feedback.feedback_id) AS total_feedbacks
FROM Events
INNER JOIN Feedback
ON Events.event_id = Feedback.event_id
GROUP BY Events.event_id, Events.title
HAVING COUNT(Feedback.feedback_id) >= 10
ORDER BY average_rating DESC;