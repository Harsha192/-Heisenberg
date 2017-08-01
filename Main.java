package com.company;

import java.util.ArrayList;

public class Main {


    public static ArrayList<Ball> list = new ArrayList<>();


    public static void updateTime(double time) {
        for (int i=0;i<list.size();i++){
            Ball b = list.get(i);
            double length = b.getSpeed()*time;
            b.setX(b.getX()+length*Math.cos(Math.toRadians(b.getAngleOfSpeed()))) ;
            b.setY(b.getY()+length*Math.sin(Math.toRadians(b.getAngleOfSpeed()))) ;
        }
    }

    public static void showAll(ArrayList<Ball> ball) {
        int i=1;
        for(Ball temp : ball){
            System.out.println("Ball "+i+" "+temp);
            i++;
        }
    }

    public static void main(String[] args) {
        Ball b31 = new Ball(0.0, 1.0, 5.0, 0.0);
        list.add(b31);
        updateTime(10.0);
        Ball b32 = new Ball(75.0, 1.0, 2.5, 0.0);
        list.add(b32);
        updateTime(10.0);
        if(b31.willCollide(b32))
            System.out.println("B31 and B32 will collide");
        showAll(list);

    }
}
