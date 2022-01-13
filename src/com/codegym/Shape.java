package com.codegym;

public class Shape {
    private String color;
    private boolean filled;

    @Override
    public String toString() {
        String res = "A shape with color of " + this.color;
        res += this.filled? " and filled" : " and not filled";
        return res;
    }

    public double getArea() {
        return 0; // sẽ được triển khai lại trong từng subclass
    }
    public double getPerimeter(){
        return 0; // sẽ được triển khai lại trong từng subclass
    }

    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
