package com.styx.listviewtest;

/**
 * Created by xiehaojie on 2017/7/22.
 */

public class Fruit {
    private String name;
    private int imageID;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageID = imageId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageID()
    {
        return imageID;
    }
}
