public class Booking {

    private int numberOfNights;
    private Bedroom bedroom;

    public Booking(int numberOfNights, Bedroom bedroom){
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public void createNewBooking(int nightsBooked, Bedroom bedroom){
        this.numberOfNights = nightsBooked;
        this.bedroom = bedroom;
    }
    public double calculateBill(){
        totalBill = this.numberOfNights * bedroom.nightlyRates

                //GET NIGHTLY RATES
//        bedroom.nightlyRates
    }


}
