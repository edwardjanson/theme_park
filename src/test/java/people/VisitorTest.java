package people;

import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;

    @Before
    public void before(){
        visitor = new Visitor(14, 120, 40.0);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor.addVisitedAttraction(rollerCoaster);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(120, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void hasVisitedAttractions() {
        assertEquals(1, visitor.getVisitedAttractions().size());
    }

    @Test
    public void canAddVisitedAttractions() {
        visitor.addVisitedAttraction(dodgems);
        assertEquals(2, visitor.getVisitedAttractions().size());
    }
}
