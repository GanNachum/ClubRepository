package com.jetbrains;

public class EventCostElement {
    Element name;
    Monry price;

    public Element getName() {
        return name;
    }

    public void setName(Element name) {
        this.name = name;
    }

    public Monry getPrice() {
        return price;
    }

    public void setPrice(Monry price) {
        this.price = price;
    }

    public EventCostElement(Element name, Monry price) {
        this.name = name;
        this.price = price;
    }

}
