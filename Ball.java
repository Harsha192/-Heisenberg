package com.company;

import java.util.ArrayList;

/**
 * Created by New on 2016-07-11.
 */
public class Ball {
    private double x;
    private double y;
    private double speed;
    private double angleOfSpeed;
    public  ArrayList<Ball> list = new ArrayList<>();

    public Ball(double x, double y, double speed, double angleOfSpeed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.angleOfSpeed = angleOfSpeed;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAngleOfSpeed() {
        return angleOfSpeed;
    }

    public boolean willCollide(Ball ball) {
        if (this.getX()==ball.getX() && this.getY()==ball.getY()){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
