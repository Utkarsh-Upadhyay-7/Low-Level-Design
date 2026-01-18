package VehicleFactoryPattern;

import FareStrategyPattern.parkingFeeStrategy;

public class otherVehicle extends Vehicle{
    public otherVehicle(String licence_no, String vehicleType, parkingFeeStrategy feeStrategy) {
        super(licence_no, vehicleType, feeStrategy);
    }
}
