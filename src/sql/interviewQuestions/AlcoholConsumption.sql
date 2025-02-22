-- Write a query that returns all countries whose annual average alconol consumption per person is 0 liters (i.e. total_consumption iS O)
--
-- +------------------------------+
-- | alcohol_consumption          |
-- +------------------------------+
-- | id  - INTEGER                |
-- | country - VARCHAR(50)        |
-- | beer_consumption - INTEGER   |
-- | spirit_consumption - INTEGER |
-- | wine_consumption - INTEGER   |
-- | total_consumption - FLOAT    |
-- +------------------------------+
-- Requirements
--
--  - Expected column country
--  - Sort the rows by country ascending

SELECT country
FROM alcohol_consumption
WHERE total_consumption <= 0
ORDER BY country;


-- BEWARE COMPARING FLOATING POINTS:
--
-- WHERE total_consumption <= 0  -- Safer floating-point comparison
--
-- OR
--
-- WHERE ABS(total_consumption) < 0.0001