-- Employee salary aggregations
--
-- Write a query to find the sum, minimum, and maximum of the salaries of the employees from the given table.
-- Sample input
--
-- Table: EmployeeDepartment
-- +---------------+---------+
-- | Field         | Type    |
-- +---------------+---------+
-- | employee_id   | Integer |
-- +---------------+---------+
-- | employee_name | Text    |
-- +---------------+---------+
-- | job           | Text    |
-- +---------------+---------+
-- | manager_id    | Integer |
-- +---------------+---------+
-- | salary        | Integer |
-- +---------------+---------+
--
-- Sample
-- +-------------+---------------+---------+------------+--------+
-- | employee_id | employee_name | job     | manager_id | salary |
-- +-------------+---------------+---------+------------+--------+
-- | 7369        | Smith         | Clerk   | 7902       | 800    |
-- +-------------+---------------+---------+------------+--------+
-- | 7566        | Jones         | Manager | 7839       | 3000   |
-- +-------------+---------------+---------+------------+--------+
-- | 7782        | Clark         | Manager | 7839       | 3000   |
-- +-------------+---------------+---------+------------+--------+
-- | 7788        | Scott         | Analyst | 7566       | 4000   |
-- +-------------+---------------+---------+------------+--------+
--
-- Sample Output
-- +-------+-----+------+
-- | SUM   | MIN | MAX  |
-- +-------+-----+------+
-- | 10800 | 800 | 4000 |
-- +-------+-----+------+

SELECT
    SUM(salary) AS SUM,
    MIN(salary) AS MIN,
    MAX(salary) AS MAX
FROM
    EmployeeDepartment;