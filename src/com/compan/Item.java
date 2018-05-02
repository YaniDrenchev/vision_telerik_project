package com.compan;

public  class Item {

    private String name;
    private Double price;
    private Integer rating;
    public Item(){

    }
    public Item(String name, Double price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}