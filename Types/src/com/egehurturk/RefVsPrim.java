package com.egehurturk;

import java.awt.*;

public class RefVsPrim {
    public static void main(String[] args) {
        byte x = 2;
        byte y = x;
        System.out.println(y);
        Point point1 = new Point(1, 1);
        Point point2 = point1; // will hold address of the object
        point1.x = 2;
        System.out.println(point2);
    }
}

