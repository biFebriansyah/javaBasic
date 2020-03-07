package com.Learn.java.model;


/**
 * GenericClass
 */
public class GenericClass<T> {

    private T t;

    public void addData (T t) {
        this.t = t;
    }

    public void showData () {
        System.out.println(this.t);
    }
    
}