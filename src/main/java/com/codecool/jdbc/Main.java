package com.codecool.jdbc;

public class Main {
    public static void main(String[] args) {
        JdbcManager jdbcManager = new JdbcManager();

        jdbcManager.showPeopleWithData();
        System.out.println("-----------------------------------");
        jdbcManager.showPeopleUnder18();
        System.out.println("-----------------------------------");
        jdbcManager.showPeopleFromNewYorkCity();
        System.out.println("-----------------------------------");
        jdbcManager.showPeopleWhoseNamesStartWithC();
        System.out.println("-----------------------------------");
        jdbcManager.showPeopleOrderedByName();
    }
}
