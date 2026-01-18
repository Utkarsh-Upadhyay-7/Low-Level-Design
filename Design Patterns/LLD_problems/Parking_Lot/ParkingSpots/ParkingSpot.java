package ParkingSpots;
import VehicleFactoryPattern.Vehicle;

public abstract class ParkingSpot {
    private int spotno;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String spotType;

    // Constructor to initialize parking spot with spot number and type
    public ParkingSpot(int spotno, String spotType) {
        this.spotno = spotno;
        this.isOccupied = false;
        this.spotType = spotType;
    }
    // Method to check if the spot is occupied
    public boolean isOccupied(){
        return isOccupied;
    }
    // Abstract method to check if a vehicle can park in this spot
    public abstract boolean canParkVehicle(Vehicle vehicle);

    // Method to park a vehicle in the spot
    public  void parkVehicle(Vehicle vehicle){
        // Check if the spot is already occupied
        if(isOccupied){
            throw new IllegalArgumentException("Spot is already occupied");
        }
        // Check if the vehicle can be parked in this spot
        if (!canParkVehicle(vehicle)){
            throw new IllegalArgumentException("This spot is not suitable for "+ vehicle.getVehicleType());
        }
        this.vehicle=vehicle;
        this.isOccupied=true;
    }
      // Method to vacate the parking spot
    public void vacate(){
        if(!isOccupied){
            throw new IllegalStateException(" Spot is already vacant. ");
        }
        this.vehicle=null;
        this.isOccupied=false;
    }
   // getter
    public int getSpotno() {
        return spotno;
    }

    public String getSpotType() {
        return spotType;
    }
}
