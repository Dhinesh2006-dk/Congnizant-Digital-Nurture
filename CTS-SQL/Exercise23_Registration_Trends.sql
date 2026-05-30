SELECT YEAR(registration_date) AS registration_year,
       MONTH(registration_date) AS registration_month,
       COUNT(registration_id) AS total_registrations
FROM Registrations
WHERE registration_date >= CURDATE() - INTERVAL 12 MONTH
GROUP BY YEAR(registration_date),
         MONTH(registration_date)
ORDER BY registration_year,
         registration_month;