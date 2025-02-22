-- Consider the following table in MySQL:
--
-- Table: Employee
-- +-------------+------------+-----------+--------+--------------+------------+
-- | Employee_Id | First_Name | Last_Name | Salary | Joining_Date | Department |
-- +-------------+------------+-----------+--------+--------------+------------+
-- | 1           | Alice      | Smith     | 10000  | 01-MAR-2013  | Banking    |
-- +-------------+------------+-----------+--------+--------------+------------+
-- | 2           | Bob        | Jones     | 80000  | 01-APR-2013  | Insurance  |
-- +-------------+------------+-----------+--------+--------------+------------+
-- | 3           | Ben        | Miller    | 90000  | 01-APR-2013  | Service    |
-- +-------------+------------+-----------+--------+--------------+------------+
-- | 4           | Mike       | Davis     | 40000  | 01-APR-2013  | Insurance  |
-- +-------------+------------+-----------+--------+--------------+------------+
-- | 5           | Tara       | Edwards   | 50000  | 01-MAR-2013  | Banking    |
-- +-------------+------------+-----------+--------+--------------+------------+
--
-- Table: Incentives
-- +-----------------+----------------+------------------+
-- | Employee_Ref_Id | Incentive_Date | Incentive_Amount |
-- +-----------------+----------------+------------------+
-- | 1               | 01-APR-2014    | 5000             |
-- +-----------------+----------------+------------------+
-- | 2               | 01-SEP-2013    | 6000             |
-- +-----------------+----------------+------------------+
-- | 3               | 01-DEC-2013    | 4000             |
-- +-----------------+----------------+------------------+
-- | 1               | 01-MAR-2014    | 4500             |
-- +-----------------+----------------+------------------+
-- | 2               | 01-MAR-2014    | 3500             |
-- +-----------------+----------------+------------------+
--
-- Write a query used to select the first_name and incentive_amount columns from the Employee and
-- incentives tables, respectively, for all employees regardless of whether they got the incentives, and set the
-- incentive_amount to 0 for all those employees who didn't get the incentive?

SELECT
    Employee.first_name,
    IFNULL(Incentives.incentive_amount, 0) AS incentive_amount
FROM Employee
LEFT JOIN Incentives ON Employee.employee_id = Incentives.employee_ref_id;

