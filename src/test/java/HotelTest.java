import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private Hotel hotel;

    private Guest guest;

    @Before
    public void before(){
        bedroom1 = new Bedroom(11, 1, "Single");
        bedroom2 = new Bedroom(22, 2, "Double");
        bedroom3 = new Bedroom(33, 1, "Single");
        hotel = new Hotel();
        guest = new Guest("Alan Parley");
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);

    }

    @Test
    public void hotelHasRooms(){
        assertEquals(3, hotel.bedroomCount());
    }

    @Test
    public void canCheckGuestIntoRoom(){
        hotel.checkInGuest(guest, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

}
