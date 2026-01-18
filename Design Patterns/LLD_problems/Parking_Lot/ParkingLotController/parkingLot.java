package ParkingLotController;

import ParkingSpots.ParkingSpot;
import VehicleFactoryPattern.Vehicle;

import java.util.List;

public class parkingLot {
    private List<ParkingSpot> parkingspots;
    // Constructor to initialize the parking lot with parking spots

    public parkingLot(List<ParkingSpot> parkingspots) {
        this.parkingspots = parkingspots;
    }
    // Method to find an available spot based on vehicle type
    public ParkingSpot findAvailableSpot(String vehicleType){
        for (ParkingSpot spot :parkingspots){
            if(!spot.isOccupied() && spot.getSpotType().equals(vehicleType)){
                return spot;
            }
        }
        return null;
    }

    //Method to park vehicle
    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if(spot!=null){
            spot.parkVehicle(vehicle);  // Mark the spot as occupied
            System.out.println("Vehicle parked succesfully in spot "+ spot.getSpotno());
            return spot;
        }
        System.out.println("No parking spot available for " + vehicle.getVehicleType());
        return null;
    }

    // Method to vacate a spot
    public void vacateSpot(ParkingSpot spot, Vehicle vehicle){
        if(spot!=null && spot.isOccupied() && spot.getSpotType().equals(vehicle.getVehicleType())){
            spot.vacate(); // free the spot
            System.out.println(vehicle.getVehicleType() + " vacated the spot " + spot.getSpotno());
        }
        else {
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }
    //method to find by its spot no.
    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingSpot spot : parkingspots) {
            if (spot.getSpotno() == spotNumber) {
                return spot;
            }
        }
        return null; // Spot not found
    }
    // Getter for parking spots
    public List<ParkingSpot> getParkingSpots() {
        return parkingspots;
    }
}
