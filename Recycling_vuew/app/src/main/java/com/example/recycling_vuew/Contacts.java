package com.example.recycling_vuew;

public class Contacts {
    private String name ;
    private String emal ;
    private String imageUrl ;

    public Contacts(String name, String emal, String imageUrl) {
        this.name = name;
        this.emal = emal;
        this.imageUrl = imageUrl;
    }

    public String getEmal() {
        return emal;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

}


