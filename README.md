# JDBC basics

## Story

You have a table with the data of people from America. It's your job to query the data based
on what kind of information you need.

## What are you going to learn?

- Querying data using JDBC from a PostgreSQL table
- Processing data from databases in Java
- Practicing SQL queries

## Tasks

1. Create a new database called `people_db`, and generate the `people` table into it with the `people.sql` file.
    - There is a connection to the `people_db` database in DBeaver
    - Executing the `SELECT * from people;` query after executing the contents of `people.sql` in DBeaver shows the following lines: ``` id |    name   | age |    city -----------------+--------+--------- 1  | Bob       | 20  | Los Angeles 2  | Charlie   | 18  | New York City 3  | Alex      | 25  | Chicago 4  | Caroline  | 17  | New York City 5  | Alfred    | 15  | Houston 6  | Charlotte | 21  | Los Angeles 7  | Susan     | 40  | New York City 8  | Helen     | 35  | Philadelphia 9  | Pedro     | 13  | San Diego 10 | Harry     | 15  | New York City ```

2. Create a method called `showPeopleWithData` which prints every person with all of their data.
    - Each person's id, name, age and city is printed in a new line to the console

3. Create a method called `showPeopleUnder18` which prints the name and age of every person under 18.
    - The name and age of each person under 18 is printed in a new line to the console

4. Create a method called `showPeopleFromNewYorkCity` which prints the name and city of every person from New York City.
    - The name and city of each person who lives in New York City is printed in a new line to the console

5. Create a method called `showPeopleWhoseNamesStartWithC` which prints the name of every person whose name starts with C.
    - The name of each person whose name begins with a C is printed in a new line to the console

6. Create a method called `showPeopleOrderedByName` which prints the name of every person in alphabetical order.
    - The name of each person in alphabetical order is printed to the console

## General requirements

None

## Hints



## Background materials

- <i class="far fa-exclamation"></i> [Creating a new connection in DBeaver](https://dbeaver.com/docs/wiki/Create-Connection/)
- <i class="far fa-exclamation"></i> [Executing an SQL file on your database in DBeaver](https://stackoverflow.com/questions/41996458/how-to-execute-a-sql-script-in-dbeaver)
- <i class="far fa-exclamation"></i> [Writing SQL scripts in DBeaver](https://dbeaver.com/docs/wiki/SQL-Editor/)
- <i class="far fa-exclamation"></i> [Querying data from the PostgreSQL database](https://www.postgresqltutorial.com/postgresql-jdbc/query/)
- <i class="far fa-exclamation"></i> [SELECT statement](https://www.postgresqltutorial.com/postgresql-select/)
- <i class="far fa-exclamation"></i> [WHERE clause](https://www.postgresqltutorial.com/postgresql-where/)
- <i class="far fa-exclamation"></i> [LIKE operator](https://www.postgresqltutorial.com/postgresql-like/)
- <i class="far fa-exclamation"></i> [ORDER BY clause](https://www.postgresqltutorial.com/postgresql-order-by/)
