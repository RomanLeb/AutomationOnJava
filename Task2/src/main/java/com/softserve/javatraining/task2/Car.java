package com.softserve.javatraining.task2;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import static java.lang.Math.abs;

public class Car extends Vehicle {

    public Car(Point2D startX) {
        super(startX);
    }

    public void Move(Point2D end){
        path.add(super.move(this.position,end));
    }

    public Point2D getFarestPoint() {
        return path.stream().max(new Comparator<Point2D>() {
            @Override
            public int compare(Point2D o1, Point2D o2) {
                return abs(o2.getX() - o1.getX()) > 1 || abs(o1.getY() - o2.getY()) > 1 ? 1 : 0;
            }
        }).get();
    }
        public Map<Point2D, Double> pointsWithDistanceToStartX(){
            return  path.stream().collect(Collectors.toMap(point->point,point->point.getX()-position.getX()));
        }
    }




