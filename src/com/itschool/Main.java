package com.itschool;

import com.itschool.Classes.Task1.Fraction;
import com.itschool.Classes.Task2.Matrix;
import com.itschool.Classes.Task3.Figure;
import com.itschool.Classes.Task3.Point;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task 1:");
        task1();
        System.out.println("\nTask 2:");
        task2();
        System.out.println("\nTask 3:");
        task3();
    }

    private static void task1()
    {
        Fraction fraction1 = new Fraction(1, 2);
        System.out.println(fraction1);
        System.out.println(fraction1.BackFraction());

        System.out.println(fraction1);
        fraction1.ReveseFraction();
        System.out.println(fraction1);

        fraction1.Add(new Fraction(1, 2));
        System.out.println(fraction1);

        Fraction fraction2 = fraction1.Sum(new Fraction(1, 3)).Sum(new Fraction(1, 6));
        System.out.println(fraction2);

        System.out.println(Fraction.ReduceFraction(fraction2));
    }

    private static void task2()
    {
        Matrix matrix = new Matrix(3);
        for (int i = 0; i < 3; i++) { Arrays.fill(matrix.matrix[i], 0); }
        matrix.matrix[0][0] = 1;
        matrix.matrix[1][1] = 1;
        matrix.matrix[2][2] = 1;
        System.out.println(matrix.isIdentity());
        matrix.matrix[2][2] = 3;
        System.out.println(matrix.isIdentity());
    }

    public static void task3()
    {
        Point point = new Point(2, 6, "A");
        System.out.println(point);

        Figure triangle = new Figure(3);
        triangle.setTitle("Triangle");
        triangle.getPoints()[0] = point;
        triangle.getPoints()[1] = new Point(3, 9, "B");
        triangle.getPoints()[2] = new Point(0, 0, "C");

        System.out.println(triangle);

        Figure figure = new Figure(
              new Point(1, 1, "X"),
              new Point(2, 2, "Y"),
              new Point(3, 3, "Z")
        );
        figure.setTitle("Rectangle");
        System.out.println(figure);
    }
}