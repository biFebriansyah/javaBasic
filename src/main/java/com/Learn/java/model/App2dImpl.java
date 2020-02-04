package com.Learn.java.model;

import com.Learn.java.Service.App2d.App2d;

/**
 * App2dImpl
 */
public class App2dImpl implements App2d {

    private String[] shape = {"Circle", "Rectangle", "Line"};


    public void drawShape (String Shape) {
        
        String outString = "Shape unknwon";

        for (int i = 0; i < this.shape.length; i++) {

            if (Shape == this.shape[i]) {
                outString = "Drawing " + Shape;
                break;
            }
        }

        System.out.println(outString);
    }

    public void addShape (String Shape) {
        int len = this.shape.length - 1;
        this.shape[len] = Shape;
    }
}