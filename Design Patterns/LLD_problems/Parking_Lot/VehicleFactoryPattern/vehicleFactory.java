package VehicleFactoryPattern;

import FareStrategyPattern.parkingFeeStrategy;

public class vehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licenese_no, parkingFeeStrategy feeStrategy){
        if(vehicleType.equalsIgnoreCase("car")){
            return new carVehicle(licenese_no, vehicleType, feeStrategy);
        } if(vehicleType.equalsIgnoreCase("bike")){
            return new bikeVehicle(licenese_no, vehicleType, feeStrategy);
        }
        return new otherVehicle(licenese_no, vehicleType, feeStrategy);
    }
}
