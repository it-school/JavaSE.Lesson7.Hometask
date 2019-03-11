package com.itschool.Classes;

import java.util.Arrays;

public class Figure
{
    private Point [] points;
    private String title;

    public Point[] getPoints()
    {
        return points;
    }

    public void setPoints(Point[] points)
    {
        this.points = points;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Figure(Point point1, Point point2, Point point3)
    {
        points = new Point[3];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
    }

    public Figure(int pointsNumber)
    {
        points = new Point[pointsNumber];
    }

    public double LengthSide(Point point1, Point point2)
    {
        double kat1, kat2;
        kat1 = Math.abs(point1.getX() - point2.getX());
        kat2 = Math.abs(point1.getY() - point2.getY());

        return Math.sqrt(kat1*kat1 + Math.pow(kat2,2));
    }

    public double PerimeterCalculator()
    {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++)
        {
            perimeter += this.LengthSide(points[i], points[(i+1)%points.length /*((i+1) = points.length ? 0 : i+1)*/]);
        }

        return perimeter;
    }

    @Override
    public String toString()
    {
        String result = this.title+"\n";

        for (Point point: points)
        {
            result += point+"\n";
        }

        result += "Perimeter: " + String.format("%5.2f", this.PerimeterCalculator());
        return result;
    }
}
