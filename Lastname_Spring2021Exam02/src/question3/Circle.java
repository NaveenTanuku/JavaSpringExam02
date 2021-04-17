/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author S542000
 */
public class Circle {
    private double radius;
    private double area;
    private String name;

    public Circle(double radius, double area, String name) {
        this.radius = radius;
        this.area = area;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", area=" + area + ", name=" + name + '}';
    }
}
