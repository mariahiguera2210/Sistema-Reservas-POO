package org.example;

public class User {

    private String name;
    private String id;
    private long phoneNumber;

    public User(String name, String id, long phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public long getPhoneNumber() {
        return phoneNumber;
    }
}
