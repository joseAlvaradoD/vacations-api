package com.acme.vacations.model;

public class Include{
    private String what;
    private String description;

    public Include(String what, String description) {
        this.what = what;
        this.description = description;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
