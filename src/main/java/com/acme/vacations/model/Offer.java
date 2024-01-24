package com.acme.vacations.model;

public class Offer{
    private double discount;
    private String description;
    private String expires;

    public Offer(double discount, String description, String expires) {
        this.discount = discount;
        this.description = description;
        this.expires = expires;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }
}
