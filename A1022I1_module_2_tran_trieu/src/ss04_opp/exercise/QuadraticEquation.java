package ss04_opp.exercise;


import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;//This is a,b,c
    private double discriminant;
    private double root;
    private double rootFirst;
    private double rootSecond;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow((b), 2) - 4 * a * c;
        return delta;
    }

    public double getRootFirst() {
        rootFirst = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return rootFirst;
    }

    public double getRootSecond() {
        rootSecond = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return rootSecond;
    }

    public double getRoot() {
        root = -b / (2 * a);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a,b,c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            double rootFirst = quadraticEquation.getRootFirst();
            double rootSecond = quadraticEquation.getRootSecond();
            System.out.printf("The equation has two roots %.2f and %.2f ", rootFirst, rootSecond);
        } else if (delta == 0) {
            double root = quadraticEquation.getRoot();
            System.out.printf("The equation has one root %.2f", root);
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}
