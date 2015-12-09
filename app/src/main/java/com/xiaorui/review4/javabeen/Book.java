package com.xiaorui.review4.javabeen;

/**
 * Created by Administrator on 2015/12/9.
 */
public class Book {
    private int id;
    private String name;
    private float price;


    public Book() {
    }

    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return super.toString();
    }


}
