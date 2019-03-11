package com.itschool.Classes;

public class Point
{
    private double x;
    private double y;
    private String title;

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = Math.abs(x);
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = Math.abs(y);
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Point()
    {
        this.x = 0;
        this.y = 0;
        this.title = "";
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y, String title)
    {
        this.x = x;
        this.y = y;
        this.title = title;
    }

    @Override
    public String toString()
    {
        return this.title+": ("+this.x+", "+this.y+")";
    }
}