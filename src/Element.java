package com.jetbrains;

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
        public static void main(String[] args) {
        String name = null;
        Element element = new Element(name);

    }
}
}
