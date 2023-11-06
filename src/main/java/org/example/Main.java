package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle1 = new Circle(12.0, "Grey", true);
        Rectangle rectangle1 = new Rectangle(13,17, "Purple", true);
        Circle ctvar = new Circle();
        Rectangle retvar = new Rectangle();
//        Circle circle2 = new Circle(5.0);

        System.out.printf("Circle: %s the area is %s and Perimeter is %s %n", circle1.toString(), circle1.getArea(), circle1.getPerimeter());
        System.out.printf("Rectangle: %s the area is %s and perimeter is %s %n", rectangle1.toString(), rectangle1.getArea(), rectangle1.getPerimeter());

        ctvar.setRadius(144);
        ctvar.setColor("Yellow");
        ctvar.setFilled(true);

        retvar.setHeight(1024);
        retvar.setWidth(768);
        retvar.setColor("White");
        retvar.setFilled(true);

        System.out.printf("Update of circle %s", ctvar.toString());
        System.out.printf("Update of rect %s", retvar.toString());
    }
}