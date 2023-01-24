package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorAge20And180cm;
    Visitor visitorAge11And140cm;


    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorAge20And180cm = new Visitor(20, 180, 20);
        visitorAge11And140cm = new Visitor(11, 140, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }


    @Test
    public void poepleOver12PayDefault() {
        assertEquals(4.50, dodgems.priceFor(visitorAge20And180cm), 0.0);
    }

    @Test
    public void poepleUnder12PayHalf() {
        assertEquals(2.25, dodgems.priceFor(visitorAge11And140cm), 0.0);
    }
}
