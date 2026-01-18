package VehicleFactoryPattern;

import FareStrategyPattern.parkingFeeStrategy;

public class carVehicle extends Vehicle{
    public carVehicle(String licence_no, String vehicleType, parkingFeeStrategy feeStrategy) {
        super(licence_no, vehicleType, feeStrategy);
    }
}
