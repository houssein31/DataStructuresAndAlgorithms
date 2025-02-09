/*

Weather Observation Station 7

Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.

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
WHERE CITY REGEXP '[aeiouAEIOU]$';

-- Using LEFT/RIGHT
SELECT DISTINCT CITY
FROM STATION
WHERE RIGHT(CITY, 1) IN ('A', 'E', 'I', 'O', 'U');


SELECT DISTINCT CITY
FROM STATION
WHERE
    CITY LIKE '%a' OR
    CITY LIKE '%e' OR
    CITY LIKE '%i' OR
    CITY LIKE '%o' OR
    CITY LIKE '%u';

