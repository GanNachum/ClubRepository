package com.GanNachum;

class Apartment {
    private int apartmentNum;

    public Apartment(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public int getApartmentNum() {
        return this.apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "ApartmentNum=" + apartmentNum +
                '}';
    }
}
