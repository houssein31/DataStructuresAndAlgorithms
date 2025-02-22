-- +--------------------------+
-- | basketball_player_stats  |
-- +--------------------------+
-- | id  - INTEGER            |
-- | first_name - VARCHAR(50) |
-- | last_name - VARCHAR(50)  |
-- | games_played - INTEGER    |
-- | ppg - FLOAT              |
-- | rpg - FLOAT              |
-- | apg - FLOAT              |
-- | fgpct - FLOAT            |
-- | ftpct FLOAT              |
-- +--------------------------+
--
-- Write a query that returns the top all-around basketball players. We define a top all-around basketball player as someone
-- whose PPG is 20.0 or higher, RPG and APG are both 5.0 or higher, and games_played is 65 or higher
--
-- Requirements:
--
--  - Expected columns: first_name, last_nane, in that order
--  - Sort the rows by last_name then first_name in alphabetical order
--


SELECT first_name, last_name
FROM basketball_player_stats
WHERE ppg >= 20.0 AND RPG >= 5.0 AND APG >= 5.0 AND games_played >= 65W
ORDER BY last_name, first_name;