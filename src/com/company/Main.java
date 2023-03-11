package com.company;

public class Main {

    public static void main(String[] args) {
        Shape a = new ColorDecorator(new RedBorderDecorator(new Rectangle()), "blue");
        a.draw();
        a.area();

    }
}
