package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private static final int MINIMUM_AGE = 15;
    private static final int MINIMUM_HEIGHT = 145;
    private static final double DEFAULT_PRICE = 8.40;


    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > MINIMUM_AGE && visitor.getHeight() > MINIMUM_HEIGHT;
    }

    public double defaultPrice() {
        return DEFAULT_PRICE;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getHeight() < 200 ? DEFAULT_PRICE : DEFAULT_PRICE * 2;
    }
}
