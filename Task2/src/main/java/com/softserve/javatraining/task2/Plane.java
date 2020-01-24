package com.softserve.javatraining.task2;

public class Plane implements Movable3D {
    Point3D start;

    public Plane(Point3D start) {
        this.start = start;
    }

    @Override
    public Point3D move(Point3D end) {
        return new Point3D(end.getX()-start.getX(),end.getY()-start.getY(),end.getZ()-end.getY());
    }
}
