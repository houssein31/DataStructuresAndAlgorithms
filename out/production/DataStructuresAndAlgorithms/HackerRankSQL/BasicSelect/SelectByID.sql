/*

 Select By ID

Query all columns for a city in CITY with the ID 1661.

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

SELECT *
FROM CITY
WHERE ID = 1661;