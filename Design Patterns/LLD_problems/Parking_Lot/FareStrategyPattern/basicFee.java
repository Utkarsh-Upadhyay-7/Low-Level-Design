package FareStrategyPattern;

import ENUM.DurationType;

public class basicFee implements parkingFeeStrategy{
    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {
        switch (vehicleType.toLowerCase()){
            case "car":
                return durationType == DurationType.HOURS
                        ? duration*10 : duration*10*24 ;

            case "bike":
                return durationType == DurationType.HOURS
                        ? duration*5 : duration*10*24 ;

            default:
                return durationType == DurationType.HOURS
                        ? duration*15 : duration*10*24 ;
        }
    }
}
