package VehicleFactoryPattern;

import FareStrategyPattern.parkingFeeStrategy;

public class bikeVehicle extends Vehicle{
    public bikeVehicle(String licence_no, String vehicleType, parkingFeeStrategy feeStrategy) {
        super(licence_no, vehicleType, feeStrategy);
    }
}
