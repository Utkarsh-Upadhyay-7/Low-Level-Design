import ENUM.DurationType;
import ParkingSpots.ParkingSpot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ParkingSpots.*;
import ParkingLotController.parkingLot;
import FareStrategyPattern.*;
import VehicleFactoryPattern.*;
import PaymentStrategyPattern.*;

public class Main_Parking_Lot {
    public static void main(String[] args) {
        System.out.println("Hello,In the World of parking spot");

        // Initialize parking spots
        List<ParkingSpot> parkingSpots = new ArrayList<>();

        parkingSpots.add(new carParkingSpot(1, "Car"));
        parkingSpots.add(new carParkingSpot(2,"Car"));
        parkingSpots.add(new bikeParkingSpot(3,"Bike"));
        parkingSpots.add(new bikeParkingSpot(4,"Bike"));

        // Initialize parking lot
        parkingLot parkingLot = new parkingLot(parkingSpots);

        // Create fee strategies
        parkingFeeStrategy basic_fee = new basicFee();
        parkingFeeStrategy premium_fee = new premiumFee();

        // Create vehicles using Factory Pattern with fee strategies
        Vehicle car1 = vehicleFactory.createVehicle("Car","car123",basic_fee);
        Vehicle car2 = vehicleFactory.createVehicle("Car","car456",basic_fee);

        Vehicle bike1 = vehicleFactory.createVehicle("Bike","bike123",premium_fee);
        Vehicle bike2 = vehicleFactory.createVehicle("Bike","bike456",premium_fee);

        // Park vehicles
        ParkingSpot carspot1 = parkingLot.parkVehicle(car1);
        ParkingSpot carspot2 = parkingLot.parkVehicle(car2);

        ParkingSpot bikespot1 = parkingLot.parkVehicle(bike1);
        ParkingSpot bikespot2 = parkingLot.parkVehicle(bike2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle");
        System.out.println("1. Credit Card");
        System.out.println("2 Cash");
        int paymentMethod = scanner.nextInt();

        // Process payments using Strategy Patterns
        if(carspot1!=null){
            double car_fee = car1.calculateFee(2, DurationType.HOURS);
            payment_strategy car_payment_strategy = getPaymentStrategy(paymentMethod,car_fee);
            car_payment_strategy.processpayment(car_fee);
            parkingLot.vacateSpot(carspot1,car1);
        }

        if(bikespot1!=null){
            double bike_fee = bike1.calculateFee(3, DurationType.HOURS);
            payment_strategy bike_payment_strategy = getPaymentStrategy(paymentMethod,bike_fee);
            bike_payment_strategy.processpayment(bike_fee);
            parkingLot.vacateSpot(bikespot1,bike1);
        }
        scanner.close();
    }
    private static payment_strategy getPaymentStrategy(
            int paymentMethod, double fee) {
        switch (paymentMethod) {
            case 1:
                return new creditCardPayment(fee);
            case 2:
                return new cashPayment(fee);
            default:
                System.out.println("Invalid choice! Default to Credit card payment.");
                return new creditCardPayment(fee);
        }
    }
}