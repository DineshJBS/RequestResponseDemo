package com.products.dto;

public class Dob {
    private String date;

    private String age;

    public Dob() {
    }

    public Dob(String date, String age) {
        this.date = date;
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dob{" +
                "date='" + date + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
