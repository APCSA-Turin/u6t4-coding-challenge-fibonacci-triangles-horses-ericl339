package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      /* IMPLEMENT ME */
      return Math.hypot(x-other.getX(), y-other.getY());
    }

    public int getX() {
      return x;
    }
    public int getY() {
      return y;
    }

    public void setX(int newX){
      x = newX;
    }

    public void setY(int newY){
      y = newY;
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
      Point point1 = new Point(0, 0);
      Point point2 = new Point(4, 4);
      System.out.println(point1.distanceTo(point2));
    }
  }
  