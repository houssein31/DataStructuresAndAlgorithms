/*

 Weather Observation Station 11

Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.

Input Format

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


 */

-- Using REGEXP
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^aeiouAEIOU]'   -- Cities that do not start with vowels
   OR CITY REGEXP '[^aeiouAEIOU]$';   -- Cities that do not end with vowels

-- Using LEFT/RIGHT
SELECT DISTINCT CITY
FROM STATION
WHERE LEFT(CITY, 1) NOT IN ('A', 'E', 'I', 'O', 'U')
   OR RIGHT(CITY, 1) NOT IN ('A', 'E', 'I', 'O', 'U');


SELECT DISTINCT CITY
FROM STATION
WHERE
    (CITY NOT LIKE 'A%'
        AND CITY NOT LIKE 'E%'
        AND CITY NOT LIKE 'I%'
        AND CITY NOT LIKE 'O%'
        AND CITY NOT LIKE 'U%')
   OR
    (CITY NOT LIKE '%a'
        AND CITY NOT LIKE '%e'
        AND CITY NOT LIKE '%i'
        AND CITY NOT LIKE '%o'
        AND CITY NOT LIKE '%u');