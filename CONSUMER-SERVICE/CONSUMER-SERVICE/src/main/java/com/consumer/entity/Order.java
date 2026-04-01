package com.consumer.entity;

public class Order {
    private String id;
    private String name;
    private Double price;
    private String email;

    public Order(){}

    public Order(String email, Double price, String name, String id) {
        this.email = email;
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", email='" + email + '\'' +
                '}';
    }
}
