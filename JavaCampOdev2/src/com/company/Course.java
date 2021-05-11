package com.company;

public class Course {
    private int id;
    private String name;
    private int price = 0;
    private Instructer instructer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Instructer getInstructer() {
        return instructer;
    }

    public void setInstructer(Instructer instructer) {
        this.instructer = instructer;
    }
}
