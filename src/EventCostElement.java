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

    //main
    public class Main {

        public static void main(String[] args) {
            float price = 0;
            Money money = new Money(price);
            EventCostElement e = new EventCostElement(element, money);
        }
    }
}
