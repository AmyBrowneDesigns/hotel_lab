import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(23, 2, "Double");
        guest = new Guest("Amy Browne");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(23, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void hasRoomType(){
        assertEquals("Double", bedroom.getRoomType());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }


    @Test
    public void canCountGuests(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void canCheckAvailable(){
        assertEquals(true, bedroom.checkAvailability());
    }

    @Test
    public void canCheckNotAvailable(){
        bedroom.addGuest(guest);
        assertEquals(false, bedroom.checkAvailability() );
    }
}
