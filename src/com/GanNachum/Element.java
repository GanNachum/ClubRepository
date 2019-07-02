//package com.jetbrains;
package com.GanNachum;

public class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //main
    public class Main {
        public void main(String[] args) {
        String name = "Test";
        Element element = new Element(name);

    }
}
}
