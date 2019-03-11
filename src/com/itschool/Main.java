package com.itschool;

import com.itschool.Classes.Figure;
import com.itschool.Classes.Point;

public class Main {

    public static void main(String[] args) {

        task3();
    }

    public static void task3()
    {
        Point point = new Point(2,6, "A");
        System.out.println(point);

        Figure triangle = new Figure(3);
        triangle.getPoints()[0] = point;
        triangle.getPoints()[1] = new Point(3,9, "B");
        triangle.getPoints()[2] = new Point(0,0, "C");

        System.out.println(triangle);

        Figure rectangle = new Figure(new Point(1,1), new Point(2,2), new Point(3,3));
        System.out.println(rectangle);
    }
}
