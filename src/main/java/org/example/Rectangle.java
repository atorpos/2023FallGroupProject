package org.example;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(height+width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Retangle with height " + height + " width " + width + " with orignal " + super.toString();
    }
}
