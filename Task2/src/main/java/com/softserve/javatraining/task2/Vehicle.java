package com.softserve.javatraining.task2;

import java.util.LinkedList;
import java.util.List;

public abstract class Vehicle implements Movable2D {
    protected Point2D position;
    protected List<Point2D> path;

    protected Vehicle(Point2D startX) {
        this.position = startX;
        path = new LinkedList<>();
    }

    public List<Point2D> getPath() {
        return path;
    }

    public void Move(Point2D end){
        System.out.println("Move");
    }
}
