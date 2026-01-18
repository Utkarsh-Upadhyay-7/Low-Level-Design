package VehicleFactoryPattern;

import ENUM.DurationType;
import FareStrategyPattern.parkingFeeStrategy;

public abstract class Vehicle {
    protected String licence_no;
    protected String vehicleType;
    private parkingFeeStrategy feeStrategy;

    public Vehicle(String licence_no, String vehicleType, parkingFeeStrategy feeStrategy) {
        this.licence_no = licence_no;
        this.vehicleType = vehicleType;
        this.feeStrategy = feeStrategy;
    }

    public String getLicence_no() {
        return licence_no;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double calculateFee(int duration, DurationType durationType){
        return feeStrategy.calculateFee(vehicleType, duration,durationType);
    }

}
