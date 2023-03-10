package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private static final int MINIMUM_AGE = 18;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= MINIMUM_AGE;
    }
}
