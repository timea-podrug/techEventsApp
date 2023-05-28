package com.example.techeventsapp.Domain;

import java.io.Serializable;

public class ItemsDomain implements Serializable {
    private String title;
    private String date;
    private String description;
    private String topic;
    private boolean wifi;
    private boolean drink;
    private boolean food;
    private int price;

    public ItemsDomain(String s, String s1, String s2, String just_chilling, String nikolina_kukoč, int i, String pic1, boolean b) {
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isFood() {
        return food;
    }

    public boolean isDrink() {
        return drink;
    }

    public ItemsDomain(boolean wifi, boolean food, boolean drink) {
        this.wifi = wifi;
        this.food = food;
        this.drink = drink;
    }

    private String pic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public boolean getWifi() {
        return wifi;
    }


    public boolean getFood() {return food;}

    public void setFood(boolean food) {
        this.food = food;
    }
    public boolean getDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    private String person;



    public ItemsDomain(String title, String date, String description, String topic, String person, int price, String pic, boolean wifi, boolean food,boolean drink) {
        this.title = title;
        this.description = description;
        this.topic = topic;
        this.person = person;
        this.price = price;
        this.pic = pic;
        this.wifi = wifi;
        this.food = food;
        this.drink = drink;
        this.date = date;
    }


}
