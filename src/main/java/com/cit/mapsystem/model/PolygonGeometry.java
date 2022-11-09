package com.cit.mapsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PolygonGeometry {
    @Id
    @GeneratedValue
    private int id;
    private String type;
    private Double[][][] coordinates;
    private String description;

    public PolygonGeometry(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double[][][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double[][][] coordinates) {
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
