//import org.junit.*;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {

    @Test
    public void newRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getsHeight_2() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getLength());
    }
    @Test
    public void all_returnsAllInstancesOfRectangle_true() {
        Rectangle firstRectangle = new Rectangle(10, 20);
        Rectangle secondRectangle = new Rectangle(5, 5);
        assertTrue(Rectangle.all().contains(firstRectangle));
        assertTrue(Rectangle.all().contains(secondRectangle));
    }

    @Test
    public void getWidth_getsRectangleWidth_4() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }
    @Test
    public void area_returnsTheAreaOfTheRectangle_450() {
        Rectangle testRectangle = new Rectangle(15, 30);
        assertEquals(450, testRectangle.area());
    }
}