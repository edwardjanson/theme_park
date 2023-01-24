import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> locations;

    public ThemePark() {
        locations = new ArrayList<IReviewed>();
    }

    public void addLocation(IReviewed location) {
        locations.add(location);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return locations;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        int visitCount = attraction.getVisitCount();
        attraction.setVisitCount(visitCount += 1);
        visitor.addVisitedAttraction(attraction);
    }
}
