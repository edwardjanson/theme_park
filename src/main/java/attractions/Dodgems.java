package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private static final double DEFAULT_PRICE = 4.50;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    public double defaultPrice() {
        return DEFAULT_PRICE;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() > 12 ? DEFAULT_PRICE : DEFAULT_PRICE / 2;
    }
}
