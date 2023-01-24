import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import static org.junit.Assert.*;

public class ThemeParkTest {

    private ThemePark themePark;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private ParkingSpot parkingSpot;
    private TobaccoStall tobaccoStall;
    private Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 7);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 10);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        themePark.addLocation(dodgems);
        themePark.addLocation(park);
        themePark.addLocation(playground);
        themePark.addLocation(rollerCoaster);
        themePark.addLocation(candyflossStall);
        themePark.addLocation(iceCreamStall);
        themePark.addLocation(tobaccoStall);
        visitor = new Visitor(14, 1.2, 40.0);

    }

    @Test
    public void getAllReviewed() {
        assertEquals(7, themePark.getAllReviewed().size());
    }

    @Test
    public void visitIncrementsVisitsBy1AndAddsAttractionToList() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitAddsAttractionToList() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}