package com.company;

public class Fraction {
    private int numerator;        //attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)    // constructor
    {
        numerator = n;
        denominator = d;
    }

    public Fraction() {
        numerator = 1;
        denominator = 5;
    }

    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public Fraction add(Fraction other) {
        int n = this.numerator * other.denominator + this.denominator * other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n, d);
        return result;
    }

    public Fraction sub(Fraction other) {
        int n = this.numerator * other.denominator - this.denominator * other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n, d);
        return result;
    }

    public Fraction mult(Fraction other) {
        int n = this.numerator * other.numerator;
        int d = this.denominator * other.denominator;

        Fraction result = new Fraction(n, d);
        return result;
    }

    public Fraction rec() {
        int n = this.denominator;
        int d = this.numerator;

        Fraction result = new Fraction(n,d);
        return result;
    }

    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }

    public static void main(String[] args) {

        // Creating an Instance of Fraction (f1 and f2)
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(4, 5);

        //Adding f1 and f2
        Fraction f3 = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + f3);

        //Subtracting f1 and f2
        Fraction f4 = f1.sub(f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);

        //Multiplying f1 and f2
        Fraction f5 = f1.mult(f2);
        System.out.println(f1 + " x " + f2 + " = " + f5);

        //Making A Recipocal of f1
        Fraction f6 = f1.rec();
        System.out.println("The reciprocal of " + f1 + " is " + f6);

        //Making A Recipocal of f2
        Fraction f7 = f2.rec();
        System.out.println("The reciprocal of " + f2 + " is " + f7);

        // Creating an Instance of Fraction (f8 and f9)
        Fraction f8 = new Fraction(8, 9);
        Fraction f9 = new Fraction(7, 12);

        //Adding f8 and f9
        Fraction f10 = f8.add(f9);
        System.out.println(f8 + " + " + f9 + " = " + f10);

    }
}