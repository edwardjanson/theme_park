package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorAge20And180cm;
    Visitor visitorAge12And180cm;
    Visitor visitorAge20And140cm;
    Visitor visitorAge12And140cm;
    Visitor visitorAge20And205cm;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorAge20And180cm = new Visitor(20, 180, 20);
        visitorAge12And180cm = new Visitor(12, 180, 10);
        visitorAge20And140cm = new Visitor(20, 140, 20);
        visitorAge12And140cm = new Visitor(12, 140, 10);
        visitorAge20And205cm = new Visitor(20, 205, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isNotAllowedIfUnder12AndUnder145cm() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitorAge12And140cm));
    }

    @Test
    public void isNotAllowedIfOver12AndUnder145cm() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitorAge20And140cm));
    }

    @Test
    public void isNotAllowedIfUnder12AndOver145cm() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitorAge12And180cm));
    }

    @Test
    public void isAllowedIfOver12AndOver145cm() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitorAge20And180cm));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void poepleUnder200cmPayDefault() {
        assertEquals(8.40, rollerCoaster.priceFor(visitorAge20And180cm), 0.0);
    }

    @Test
    public void poepleOver200cmPayDouble() {
        assertEquals(16.80, rollerCoaster.priceFor(visitorAge20And205cm), 0.0);
    }
}
