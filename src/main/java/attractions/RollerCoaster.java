package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    private static final int MINIMUM_AGE = 15;
    private static final int MINIMUM_HEIGHT = 145;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > MINIMUM_AGE && visitor.getHeight() > MINIMUM_HEIGHT;
    }
}
