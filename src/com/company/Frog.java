package com.company;

public class Frog {
    private String name;
    private int xPos;
    private int yPos;

    public Frog(String n,int x, int y)
    {
        name = n;
        xPos=x;
        yPos=y;
        System.out.println(name);
    }
    public void setPos(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public void moveWest()
    {
        xPos = xPos-1;
    }
    public void moveEast()
    {
        xPos = xPos + 1;
    }
    public void moveNorth()
    {
        yPos=yPos+1;
    }

    public void jump(int bounce){
        xPos=xPos+bounce;
        yPos=yPos+bounce;
    }

    public void visit(Frog other){
        int A = other.getXPos();
        int B = other.getYPos();
        xPos=A;
        yPos=B;

    }

    public void eatFly()
    {
        System.out.println("Yum");
    }
    public String toString()
    {
        String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
        return s;
    }

    public static void main(String[] args) {

        //Freddy
        Frog f1 = new Frog("Freddy",3,4);	// create an instance of Frog
        f1.eatFly();						// call Frog methods
        f1.moveNorth();
        System.out.println(f1);

        //Francine
        Frog f2 = new Frog("Francine", -2,0);
        f2.eatFly();
        f2.jump(2);
        f1.visit(f2);
        System.out.println(f1);
        System.out.println(f2);

        //Frank
        Frog f3 = new Frog("Frank", -1,2);
        f3.jump(1);
        f3.jump(-3);
        System.out.println(f3);
        f3.visit(f1);
        System.out.println(f3);
    }

}