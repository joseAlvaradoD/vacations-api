package com.acme.vacations.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "vacations")
@Builder
@Getter
@Setter
public class Vacation {
    @Id
    private String id;
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
}