package my.sandbox.entity;

import org.apache.log4j.Logger;

public class User {
    private static final Logger userLogger = Logger.getLogger(User.class);

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }                                                                         

    public void setAge(int age) {
        this.age = age;
    }

    public String getHelloForUser() {
        userLogger.warn("-- test for logger ---");
        return "Hello, " + this.name + "!";
    }
}
