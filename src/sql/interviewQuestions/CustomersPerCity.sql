-- Write a query to list the number of customers per city. Only list the cities where the number of customers within the city is two or more.
--
-- +----------------------------+
-- | CUSTOMER                   |
-- +----------------------------+
-- | customer_id - INTEGER      |
-- | firstname - VARCHAR(50)    |
-- | lastname - VARCHAR(50)     |
-- | register_date - DATE       |
-- | birth_date - DATE          |
-- | address - VARCHAR(50)      |
-- | zipcode - CHAR(5)          |
-- | city - VARCHAR(50)         |
-- | phone_number - VARCHAR(50) |
-- +----------------------------+
--
-- Only output the CITY and CUSTOMER_COUNT columns in that order.
--
-- Output example:
-- +-----------+----------------+
-- | CITY      | CUSTOMER_COUNT |
-- +-----------+----------------+
-- | Boston    | 8              |
-- | New Dehli | 2              |
-- +-----------+----------------+

SELECT city, COUNT(customer_id) AS customer_count
FROM Customer
GROUP BY city
HAVING COUNT(customer_id) >= 2
ORDER BY city;