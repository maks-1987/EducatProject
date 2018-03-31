package com.company.model;

public class Contact {
    private String name;
    private int age;

    public Contact(String name, int phoneNumber){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getage() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int phoneNumber) {
        this.age = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + age +
                '}';
    }

}
