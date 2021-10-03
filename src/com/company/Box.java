package com.company;

public class Box {
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasALid;

    public Box(double h, double w, double l, String c, boolean lid){
        height = h;
        width = w;
        length = l;
        color = c;
        hasALid = lid;
    }
    public Box(double h, double w, double l){
        height = h;
        width = w;
        length = l;
        color = "white";
        hasALid = true;
    }
    public Box(){
        height = 1.0;
        width = 1.0;
        length = 1.0;
        color = "white";
        hasALid = false;
    }

    // accessor methods
    public void setHeight(double h)
    {
        height = h;
    }
    public double getHeight(){
        return height;
    }

    public double volume(){
        return length*width*height;
    }
    public String toString(){
        String s = "A box with dimensions " + height + " " + width + " " + length;
        s+= " It's color is " + color + " and it has a lid? " + hasALid;
        return s;
    }
    public static void main(String[] args) {
	    Box b1 = new Box(5.0, 3.0, 7.0, "red", false);
	    Box b2 = new Box(4.5, 3.7, 7.8);
	    Box b3 = new Box(1, 2, 5);

        System.out.println(b1.getHeight());
        b1.setHeight(9.9);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());

        int x = 5;
        String name = "gRaghav";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b3.toString());
    }
}
