package com.acme.vacations.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "vacations")
public class Vacation {
    private String name;
    private String description;
    public String type;
    private List<Destination> destinations;
    private List<Include> includes;
    private int numberOfNights;
    private int pricePP;
    private Offer offer;
    private String validTill;
    private boolean soldout;

    public Vacation(String name, String description, String type, List<Destination> destinations, List<Include> includes, int numberOfNights, int pricePP, Offer offer, String validTill, boolean soldout) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.destinations = destinations;
        this.includes = includes;
        this.numberOfNights = numberOfNights;
        this.pricePP = pricePP;
        this.offer = offer;
        this.validTill = validTill;
        this.soldout = soldout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<Include> getIncludes() {
        return includes;
    }

    public void setIncludes(List<Include> includes) {
        this.includes = includes;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getPricePP() {
        return pricePP;
    }

    public void setPricePP(int pricePP) {
        this.pricePP = pricePP;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public boolean isSoldout() {
        return soldout;
    }

    public void setSoldout(boolean soldout) {
        this.soldout = soldout;
    }
}