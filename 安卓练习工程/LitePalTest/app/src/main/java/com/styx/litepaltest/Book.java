package com.styx.litepaltest;

import android.support.v4.app.INotificationSideChannel;

/**
 * Created by xiehaojie on 2017/7/26.
 */

public class Book {

    private int id;
    private String author;
    private double price;
    private int pages;
    private String name;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author = author;}

    public double getPrice(){return price;}
    public void  setPrice(double price){this.price = price;}

    public int getPages(){return pages;}
    public void setPages(int pages){this.pages = pages;}

    public String getName(){return name;}
    public void setName(String name){}
}
