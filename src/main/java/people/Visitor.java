package people;

import behaviours.IReviewed;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<IReviewed> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<IReviewed>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<IReviewed> getVisitedAttractions() {
        return visitedAttractions;
    }

    public void addVisitedAttraction(IReviewed attraction) {
        visitedAttractions.add(attraction);
    }
}
