package model;

public class Person {
    private static String name;
    private static String phone_number;
    private static String email;

    public Person() {
    }

    public Person(String name, String phone_number, String email) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getPhone_number() {
        return phone_number;
    }

    public static void setPhone_number(String phone_number) {
        Person.phone_number = phone_number;
    }

    public static String getEmail() {
        return email;
    }


    public static void setEmail(String email) {
        Person.email = email;
    }

}
