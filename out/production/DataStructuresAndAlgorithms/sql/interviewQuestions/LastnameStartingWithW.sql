
-- Write a query to select only customers having their lastname starting with 'W', sorted alphabetically by lastname
-- then firstname. Only output the lastname and firstname columns.
--
-- Only output the columns LASTNAME and FIRSTNAME in that order.
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

SELECT lastname, firstname
FROM Customer
WHERE lastname LIKE 'W%'
ORDER BY lastname ASC, firstname ASC;


OR

SELECT lastname, firstname
FROM CUSTOMER
WHERE LEFT(lastname, 1) = 'W'
ORDER BY lastname ASC, firstname ASC;