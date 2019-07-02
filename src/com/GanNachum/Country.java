package com.GanNachum;

class Country {
    String CountryName;

    public Country(String name) {
        this.setName(name);
    }

    public Country(){
        this.setName("");
    }

    public Country (Country other){
        this.setName(other.getName());
    }

    public String getName() {
        return this.CountryName;
    }

    public void setName(String name) {
        this.CountryName = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + CountryName + '\'' +
                '}';
    }
}