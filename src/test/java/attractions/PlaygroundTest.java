package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorAge20;
    Visitor visitorAge12;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorAge20 = new Visitor(20, 180, 20);
        visitorAge12 = new Visitor(12, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isNotAllowedIfOver15() {
        assertEquals(false, playground.isAllowedTo(visitorAge20));
    }

    @Test
    public void isNotAllowedIfUnder16() {
        assertEquals(true, playground.isAllowedTo(visitorAge12));
    }
}
