import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("The Balmoral", 10);
        guest = new Guest("Alan Parley");
    }

    @Test
    public void hasRoomName(){
        assertEquals("The Balmoral", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.countGuests());
    }
}
