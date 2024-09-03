/*

 Japanese Cities' Names

Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
The CITY table is described as follows:

+-------------+-------------+
| Field       | Type        |
+-------------+-------------+
| ID          | NUMBER      |
+-------------+-------------+
| NAME        | VARCHAR(17) |
+-------------+-------------+
| COUNTRYCODE | VARCHAR(3)  |
+-------------+-------------+
| DISTRICT    | VARCHAR(20) |
+-------------+-------------+
| POPULATION  | NUMBER      |
+-------------+-------------+

 */

SELECT NAME
FROM CITY
WHERE COUNTRYCODE = 'JPN';