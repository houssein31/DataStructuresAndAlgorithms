/*

 Weather Observation Station 9

 Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.

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
WHERE CITY NOT REGEXP '^[aeiouAEIOU]';

-- Using LEFT/RIGHT
SELECT DISTINCT CITY
FROM STATION
WHERE LEFT(CITY, 1) NOT IN ('A', 'E', 'I', 'O', 'U');


SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT LIKE 'A%'
  AND CITY NOT LIKE 'E%'
  AND CITY NOT LIKE 'I%'
  AND CITY NOT LIKE 'O%'
  AND CITY NOT LIKE 'U%';