SELECT Users.full_name,
       COUNT(DISTINCT Registrations.event_id)
       AS events_attended,
       COUNT(DISTINCT Feedback.feedback_id)
       AS feedbacks_submitted
FROM Users
LEFT JOIN Registrations
ON Users.user_id = Registrations.user_id
LEFT JOIN Feedback
ON Users.user_id = Feedback.user_id
GROUP BY Users.user_id,
         Users.full_name;