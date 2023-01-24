import behaviours.IReviewed;

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
}
