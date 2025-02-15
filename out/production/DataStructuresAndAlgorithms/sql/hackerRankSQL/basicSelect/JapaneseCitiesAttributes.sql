/*

 Japanese Cities' Attributes

Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.

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
WHERE COUNTRYCODE = 'JPN';