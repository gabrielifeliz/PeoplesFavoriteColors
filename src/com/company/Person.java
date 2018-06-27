package com.company;

import java.util.ArrayList;

public class Person {

    private String userName;
    private ArrayList<String> favoriteColors = new ArrayList<>();

    public Person() {

    }

    public Person(String userName) {
        this.userName = userName;
    }

    public Person(String userName,
                  ArrayList<String> favoriteColors) {
        this.userName = userName;
        this.favoriteColors = favoriteColors;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<String> getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(String color) {
        favoriteColors.add(color);
    }

    @Override
    public String toString() {
        return "Person{" +
                "favoriteColors=" + favoriteColors +
                '}';
    }
}
