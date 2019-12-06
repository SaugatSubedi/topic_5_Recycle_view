package com.saugat.topic5recycleview;

public class Contacts {
    private String name;
    private String Contact_No;
    private int imageId;


    public Contacts(String name, String contact_No, int imageId) {
        this.name = name;
        Contact_No = contact_No;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_No() {
        return Contact_No;
    }

    public void setContact_No(String contact_No) {
        Contact_No = contact_No;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
