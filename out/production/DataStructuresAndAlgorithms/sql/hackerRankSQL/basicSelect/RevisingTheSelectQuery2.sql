/*

 Revising the Select Query 2

 Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

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
WHERE POPULATION > 120000 AND COUNTRYCODE = 'USA';