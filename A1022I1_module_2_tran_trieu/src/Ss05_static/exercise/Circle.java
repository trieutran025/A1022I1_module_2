package Ss05_static.exercise.access;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    private Circle(double radius) {
        this.radius = radius;
    }
   private double getRadius(){
      return this.radius;
   }
   private String getColor(){
       return  this.color;
    }


    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.getRadius());
            System.out.println(circle.getColor());
        }
    }
}

