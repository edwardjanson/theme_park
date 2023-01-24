import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> stalls;
    private ArrayList<IReviewed> attractions;

    public ArrayList<IReviewed> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAttractions() {
        return attractions;
    }

    public ThemePark() {
        stalls = new ArrayList<IReviewed>();
        attractions = new ArrayList<IReviewed>();
    }

    public void addAttraction(IReviewed attraction) {
        attractions.add(attraction);
    }
    public void addStall(IReviewed stall) {
        stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(this.attractions);
        reviewed.addAll(this.stalls);
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        int visitCount = attraction.getVisitCount();
        attraction.setVisitCount(visitCount += 1);
        visitor.addVisitedAttraction(attraction);
    }

    public ArrayList<IReviewed> getAllAllowed(Visitor visitor) {
        ArrayList<IReviewed> allowedAttractions = new ArrayList<IReviewed>();
        for (IReviewed place : getAllReviewed()){
            if (place instanceof ISecurity){
                if (((ISecurity) place).isAllowedTo(visitor)){
                    allowedAttractions.add(place);
                }
            } else {
                allowedAttractions.add(place);
            }
        }

        return allowedAttractions;
    }

    public HashMap<String, Integer> allReviews(){
        HashMap<String, Integer> reviews = new HashMap<String, Integer>();;
        for (IReviewed reviewed: getAllReviewed() ){
            reviews.put(reviewed.getName(), reviewed.getRating());
        }
        return reviews;
    }
}
