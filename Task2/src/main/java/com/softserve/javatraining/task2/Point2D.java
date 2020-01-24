package com.softserve.javatraining.task2;

public class Point2D {
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Point2D Add(double x, double y){
         return new Point2D(this.x+x,this.y+y);
    }

    public  String toString(){
        return "x:"+x+" y:"+y;
    }

    public boolean equals(Object o){
        if(o==null) return  false;
        o=(Point2D)o;
        return x==((Point2D) o).getX()&&y==((Point2D) o).getY();
    }
}
