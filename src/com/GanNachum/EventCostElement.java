//package com.jetbrains;
package com.GanNachum;

public class EventCostElement {
    Element name;
    Money price;

    public Element getName() {
        return name;
    }

    public void setName(Element name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public EventCostElement(Element name, Money price) {
        this.name = name;
        this.price = price;
    }

    //main
/*    public class Main {

        public static void main(String[] args) {
            float price = 0;
            Money money = new Money(price);
            EventCostElement e = new EventCostElement(element, money);
        }
    }
 */
}
