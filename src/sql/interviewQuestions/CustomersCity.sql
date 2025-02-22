-- Modify the query to get the list of customers' cities. The list should contain no duplicates and should be sorted alphabetically.
--
-- Only output the CITY column.
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

SELECT DISTINCT city
FROM Customer
ORDER BY city;