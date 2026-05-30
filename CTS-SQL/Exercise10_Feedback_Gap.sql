SELECT DISTINCT Events.title
FROM Events
INNER JOIN Registrations
ON Events.event_id = Registrations.event_id
LEFT JOIN Feedback
ON Events.event_id = Feedback.event_id
WHERE Feedback.feedback_id IS NULL;