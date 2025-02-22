-- Goal
--
-- Extract employees with last_name between "Hall" and "Reed" (inclusive) in alphabetical order.
--
-- +------------------------------+
-- | employees                    |
-- +------------------------------+
-- | id - INTEGER                 |
-- | firstname - VARCHAR(50)      |
-- | lastname - VARCHAR(50)       |
-- | num_years - INTEGER          |
-- | satisfaction - DECIMAL(25,5) |
-- +------------------------------+
--
-- Requirements
-- • Expected columns: first_name, last_name, in that order
-- • Sort the rows by last_name ascending.



SELECT first_name, last_name
FROM Employees
WHERE last_name >= 'Hall' AND last_name <= 'Reed'
ORDER BY last_name;

-- Add LOWER as shown bellow to handle for cae-sensitive lastnames
--
-- WHERE last_name >= 'Hall' AND last_name <= 'Reed'