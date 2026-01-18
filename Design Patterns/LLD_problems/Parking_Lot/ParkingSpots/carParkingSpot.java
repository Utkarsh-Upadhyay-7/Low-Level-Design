package ParkingSpots;

import VehicleFactoryPattern.Vehicle;

public class carParkingSpot extends ParkingSpot{

    public carParkingSpot(int spotno, String spotType) {
        super(spotno, spotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
