package com.cit.mapsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LineGeometry {
    @Id
    @GeneratedValue
    private int id;
    private String type;
    private Double[][] coordinates;
    private String size;
    private String name;

    public LineGeometry() {
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

    public Double[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double[][] coordinates) {
        this.coordinates = coordinates;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String properties) {
        this.size = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
