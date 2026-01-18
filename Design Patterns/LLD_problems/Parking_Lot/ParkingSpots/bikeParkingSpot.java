package ParkingSpots;

import VehicleFactoryPattern.Vehicle;

public class bikeParkingSpot extends ParkingSpot{

    public bikeParkingSpot(int spotno, String spotType) {
        super(spotno, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
