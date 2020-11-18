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

    public boolean checkAvailability(Bedroom bedroom){
        for(Bedroom individualRoom:this.bedrooms){
            if(individualRoom == bedroom){
                return true;
            }
        }
        return false;
    }

    public void checkInGuest(Guest guest, Bedroom bedroom){
        if (bedroom.checkAvailability() == true){
        bedroom.addGuest(guest);}
    }
}
