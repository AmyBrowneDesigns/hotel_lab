import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;


    @Before
    public void before(){
        bedroom1 = new Bedroom(22, 2, "Double", 79);
        booking = new Booking(2, bedroom1);
    }

    @Test
    public void canGetNumberOfNight(){
        assertEquals(2, booking.getNumberOfNights());
    }

    @Test
    public void canGetBedroom(){
        assertEquals(bedroom1, booking.getBedroom());
    }

    @Test
    public void canCreateBooking(){
        bedroom2 = new Bedroom(33, 2, "Double", 79);
        booking.createNewBooking(5, bedroom2);
        assertEquals(5, booking.getNumberOfNights());
        assertEquals(bedroom2, booking.getBedroom());
    }

    @Test
    public void canCalculateBill(){
        booking.calculateBill();
    }
}
