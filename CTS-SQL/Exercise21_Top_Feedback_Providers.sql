SELECT Users.full_name,
       COUNT(Feedback.feedback_id) AS total_feedbacks
FROM Users
INNER JOIN Feedback
ON Users.user_id = Feedback.user_id
GROUP BY Users.user_id,
         Users.full_name
ORDER BY total_feedbacks DESC
LIMIT 5;