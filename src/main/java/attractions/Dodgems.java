package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private static final double DEFAULT_PRICE = 4.50;
    private static final double REDUCED_PRICE_AGE = 12;
    private static final double PRICE_MULTIPLICATION = 2;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return DEFAULT_PRICE;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() > REDUCED_PRICE_AGE ? DEFAULT_PRICE : DEFAULT_PRICE / PRICE_MULTIPLICATION;
    }
}
