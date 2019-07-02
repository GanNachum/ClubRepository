package com.GanNachum;

import java.util.Arrays;

public class Organization {
    // Attributes
    private String name;
    private Location[] locations;

    // CTORs
    public Organization(Organization other) {
        setName(other.getName());
        setLocations(other.getLocations().clone());
    }

    public Organization() {
        setName(null);
        setLocations(null);
    }

    public Organization(String name, Location[] locations) {
        setName(name);
        setLocations(locations);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    // toString
    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", locations=" + Arrays.toString(locations) +
                '}';
    }
}
