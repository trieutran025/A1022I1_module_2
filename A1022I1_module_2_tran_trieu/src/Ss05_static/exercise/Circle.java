package Ss05_static.exercise.access;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    private Circle(double radius) {
        this.radius = radius;
    }
   public double getRadius(){
      return this.radius;
   }
   public String getColor(){
       return  this.color;
    }


}

