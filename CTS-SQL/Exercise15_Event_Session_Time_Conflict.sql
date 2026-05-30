SELECT
    SessionOne.title AS Session_One,
    SessionTwo.title AS Session_Two,
    SessionOne.event_id
FROM Sessions AS SessionOne
INNER JOIN Sessions AS SessionTwo
ON SessionOne.event_id = SessionTwo.event_id
AND SessionOne.session_id < SessionTwo.session_id
AND SessionOne.start_time < SessionTwo.end_time
AND SessionOne.end_time > SessionTwo.start_time;