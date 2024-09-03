/*

 Weather Observation Station 8

Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.

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
WHERE CITY REGEXP '^[aeiouAEIOU].*[aeiouAEIOU]$'
ORDER BY CITY;

-- ^[ ... ]: This part ensures that the first character is a vowel.
-- .*: This part matches any sequence of characters in between.
-- [ ... ]$: This part ensures that the last character is a vowel.

-- Using LEFT/RIGHT
SELECT DISTINCT CITY
FROM STATION
WHERE LEFT(CITY, 1) IN ('A', 'E', 'I', 'O', 'U')
    AND RIGHT(CITY, 1) IN ('A', 'E', 'I', 'O', 'U');


SELECT DISTINCT CITY
FROM STATION
WHERE
    (CITY LIKE 'A%' OR
     CITY LIKE 'E%' OR
     CITY LIKE 'I%' OR
     CITY LIKE 'O%' OR
     CITY LIKE 'U%')
  AND
    (CITY LIKE '%a' OR
     CITY LIKE '%e' OR
     CITY LIKE '%i' OR
     CITY LIKE '%o' OR
     CITY LIKE '%u');
