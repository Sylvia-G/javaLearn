package com.besttest.TestBeforeCourse;

public class User {
    String userName;
    int age;
    String school;

    public User(String userName, int age, String school) {
        this.userName = userName;
        this.age = age;
        this.school = school;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
