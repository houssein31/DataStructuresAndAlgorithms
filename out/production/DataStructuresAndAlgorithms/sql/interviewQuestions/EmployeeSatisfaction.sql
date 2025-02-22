-- Write a query that returns the employees who have been at the company for at least 5 years ( num_years superior or equal
-- to 5) and have a satisfaction level of at least 0.8 (satisfaction superior or equal to 0.8).
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
-- • Expected columns: first_name, last_ name, satisfaction, in that order.
-- • Sort the rows by last_name ascending.

SELECT first_name, last_name, satisfaction
FROM Employees
WHERE num_years >= 5 AND satisfaction >= 0.8
ORDER BY last_name ASC;