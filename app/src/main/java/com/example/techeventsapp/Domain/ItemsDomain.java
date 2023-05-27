package com.example.techeventsapp.Domain;

import java.io.Serializable;

public class ItemsDomain implements Serializable {
    private String title;
    private String adress;
    private String description;
    private String topic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    private String person;
    private int price;
    private String pic;
    private boolean wifi;

    public ItemsDomain(String title, String adress, String description, String topic, String person, int price, String pic, boolean wifi) {
        this.title = title;
        this.adress = adress;
        this.description = description;
        this.topic = topic;
        this.person = person;
        this.price = price;
        this.pic = pic;
        this.wifi = wifi;
    }
}
