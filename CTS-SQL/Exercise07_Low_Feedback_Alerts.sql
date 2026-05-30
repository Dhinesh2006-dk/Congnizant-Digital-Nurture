SELECT Users.full_name,
       Events.title,
       Feedback.rating,
       Feedback.comments
FROM Feedback
INNER JOIN Users
ON Feedback.user_id = Users.user_id
INNER JOIN Events
ON Feedback.event_id = Events.event_id
WHERE Feedback.rating < 3;