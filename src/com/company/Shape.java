package com.company;

interface Shape {
    void draw();

    void area();
}


class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void area() {
        System.out.println("The area of this rectangle is large*width");
    }
}

class RedBorderDecorator implements Shape {
    private final Shape shape;

    public RedBorderDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Drawing Red Border");
    }

    @Override
    public void area() {
        shape.area();
    }
}


class ColorDecorator implements Shape {
    private final Shape shape;
    private final String color;

    ColorDecorator(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("The shape is " + color);
    }

    @Override
    public void area() {
        shape.area();
    }
}