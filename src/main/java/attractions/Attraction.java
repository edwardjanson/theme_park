package attractions;

import behaviours.IReviewed;

import java.util.ArrayList;

public abstract class Attraction implements IReviewed {
    private String name;
    private int rating;
    private int visitCount;
    private ArrayList<IReviewed> reviews;

    public Attraction(String name, int rating) {
        this.name = name;
        this.visitCount = 0;
        this.reviews = new ArrayList<IReviewed>();
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
