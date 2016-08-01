package com.lodz360;

/**
 * Created by michalina on 31/07/16.
 */
public class User {
    private String name;
    private int age;
    private float weight;
    private float height;

    public User(String name, int age, float weight, float height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    public String toString() {
        return name + " " + " " + age + " " + weight + " " + height;
    }

    public float getWeight(){
        return weight;
    }

    public float getHeight(){
        return height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
