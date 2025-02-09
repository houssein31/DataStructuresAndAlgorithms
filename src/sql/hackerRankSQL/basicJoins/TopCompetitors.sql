/*
Julia just finished conducting a coding contest, and she needs your help assembling the leaderboard! Write a query to print the respective hacker_id and name of hackers who achieved full scores for more than one challenge. Order your output in descending order by the total number of challenges in which the hacker earned a full score. If more than one hacker received full scores in the same number of challenges, then sort them by ascending hacker_id.

Input Format

The following tables contain contest data:

Hackers:
+-----------+--------------+
| Field     | Type         |
+-----------+--------------+
| hacker_id | INTEGER      |
| name      | VARCHAR      |
+-----------+--------------+

Difficulty:
+------------------+--------------+
| Field            | Type         |
+------------------+--------------+
| difficulty_level | INTEGER      |
| score            | INTEGER      |
+------------------+--------------+

Challenges:
+--------------+------------------+--------------+
| Field        | Type             |              |
+--------------+------------------+--------------+
| challenge_id | INTEGER          |              |
| hacker_id    | INTEGER          |              |
| difficulty_level | INTEGER      |              |
+--------------+------------------+--------------+

Submissions:
+---------------+--------------+--------------+--------------+
| Field         | Type         |              |              |
+---------------+--------------+--------------+--------------+
| submission_id | INTEGER      |              |              |
| hacker_id     | INTEGER      |              |              |
| challenge_id  | INTEGER      |              |              |
| score         | INTEGER      |              |              |
+---------------+--------------+--------------+--------------+

Sample Input

Hackers Table:
+-----------+------+
| hacker_id | name |
+-----------+------+
| 86870     | Dan  |
| 90411     | Joe  |
+-----------+------+

Difficulty Table:
+------------------+-------+
| difficulty_level | score |
+------------------+-------+
| 2                | 30    |
| 6                | 100   |
+------------------+-------+

Challenges Table:
+--------------+-----------+------------------+
| challenge_id | hacker_id | difficulty_level |
+--------------+-----------+------------------+
| 71055        | 86870     | 2                |
| 66730        | 90411     | 6                |
+--------------+-----------+------------------+

Submissions Table:
+---------------+-----------+--------------+-------+
| submission_id | hacker_id | challenge_id | score |
+---------------+-----------+--------------+-------+
| 1             | 86870     | 71055        | 30    |
| 2             | 90411     | 71055        | 30    |
| 3             | 90411     | 66730        | 100   |
+---------------+-----------+--------------+-------+

Sample Output

90411 Joe

Explanation

Hacker 86870 got a score of 30 for challenge 71055 with a difficulty level of 2, so 86870 earned a full score for this challenge.

Hacker 90411 got a score of 30 for challenge 71055 with a difficulty level of 2, so 90411 earned a full score for this challenge.

Hacker 90411 got a score of 100 for challenge 66730 with a difficulty level of 6, so 90411 earned a full score for this challenge.

Only hacker 90411 managed to earn a full score for more than one challenge, so we print their hacker_id and name as space-separated values.
*/
