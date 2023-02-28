package com.codecool.jdbc;

import java.sql.*;

public class JdbcManager {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/people_db";

    static final String USER = "postgres";
    static final String PASS = "784512";

    public void showPeopleWithData() {
        String SQL = "select * from people;"; // put your query here

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement pt = conn.prepareStatement(SQL);

            ResultSet rs = pt.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String city = rs.getString(4);

                System.out.println(id + " " + name + " " + age + " " + city);
            }
            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleUnder18() {
        String SQL = "select * from people where age < 18;"; // put your query here

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement pt = conn.prepareStatement(SQL);

            ResultSet rs = pt.executeQuery();
            while (rs.next()){
                String name = rs.getString(2);
                int age = rs.getInt(3);

                System.out.println(name + " " + age);
            }
            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleFromNewYorkCity() {
        String SQL = "select * from people where city = 'New York City';"; // put your query here

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement pt = conn.prepareStatement(SQL);

            ResultSet rs = pt.executeQuery();
            while (rs.next()){
                String name = rs.getString(2);
                String city = rs.getString(4);

                System.out.println(name + " " + city);
            }
            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleWhoseNamesStartWithC() {
        String SQL = "select * from people where name like 'C%';"; // put your query here

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement pt = conn.prepareStatement(SQL);

            ResultSet rs = pt.executeQuery();
            while (rs.next()){

                String name = rs.getString(2);


                System.out.println(name);
            }
            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleOrderedByName() {
        String SQL = "select * from people order by name asc;"; // put your query here

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement pt = conn.prepareStatement(SQL);

            ResultSet rs = pt.executeQuery();
            while (rs.next()){

                String name = rs.getString(2);


                System.out.println(name);
            }
            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
