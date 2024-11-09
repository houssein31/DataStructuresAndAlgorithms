LE/*

  Weather Observation Station 5

Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths
(i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one
that comes first when ordered alphabetically.

The STATION table is described as follows:

 +--------+-------------+
| Field  | Type        |
+--------+-------------+
| ID     | NUMBER      |
+--------+-------------+
| CITY   | VARCHAR(21) |
+--------+-------------+
| STATE  | VARCHAR(2)  |
+--------+-------------+
| LAT_N  | NUMBER      |
+--------+-------------+
| LONG_W | NUMBER      |
+--------+-------------+

where LAT_N is the northern latitude and LONG_W is the western longitude.

Sample Input

For example, CITY has four entries: DEF, ABC, PQRS and WXY.

Sample Output

    ABC 3
    PQRS 4

Explanation

When ordered alphabetically, the CITY names are listed as ABC, DEF, PQRS, and WXY, with lengths 3, 3, 4 and 3.
The longest name is PQRS, but there are 3 options for shortest named city. Choose ABC, because it comes
first alphabetically.

Note
You can write two separate queries to get the desired output. It need not be a single query.

 */

-- This query retrieves the CITY with the shortest and the longest name
-- along with their respective lengths from the STATION table.

-- The first part of the query selects the CITY with the shortest name.
(
SELECT CITY, LENGTH(CITY) AS CITY_LENGTH
 FROM STATION
 -- Orders the cities first by length (ascending) and then alphabetically.
 ORDER BY LENGTH(CITY) ASC, CITY ASC
  -- Limits the result to the first row (the shortest city name).
  LIMIT 1
 )
 -- The UNION ALL combines the results from both queries into a single result set.
 UNION ALL
(
 -- The second part of the query selects the CITY with the longest name.
 SELECT CITY, LENGTH(CITY) AS CITY_LENGTH
  FROM STATION
  -- Orders the cities first by length (descending) and then alphabetically.
  ORDER BY LENGTH(CITY) DESC, CITY ASC
  -- Limits the result to the first row (the longest city name).
  LIMIT 1
  );


-- The final result will show the CITY with the shortest name and the CITY with the longest name,
-- along with their respective lengths.

