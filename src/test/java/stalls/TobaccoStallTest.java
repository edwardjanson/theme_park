package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorAge20;
    Visitor visitorAge12;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorAge20 = new Visitor(20, 180, 20);
        visitorAge12 = new Visitor(12, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isNotAllowedIfUnder18() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitorAge12));
    }

    @Test
    public void isAllowedIfOver18() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitorAge20));
    }
}
