package com.softserve.javatraining.task2;

public interface Movable2D {
    default void stop(){
        System.out.println("Stop");
    }

    default Point2D move(Point2D start, Point2D end) {
        return start.Add(end.getX()-start.getX(),end.getY()-start.getY());
    }
}
