import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();

    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public int bedroomCount(){
        return this.bedrooms.size();
    }
    public void checkInGuest(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
    }
}
