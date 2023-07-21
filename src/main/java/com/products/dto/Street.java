package com.products.dto;

public class Street {

    private String number;

    private String name;

    public Street(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Street() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Street{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
