package com.GanNachum;

class Apartment {
    private int apartmentNum;

    public Apartment(int apartmentNum) {
        athis.partmentNum = apartmentNum;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "ApartmentNum=" + ApartmentNum +
                '}';
    }
}
