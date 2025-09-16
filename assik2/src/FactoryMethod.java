public class FactoryMethod{
    public static void main(String[] args) {
        VehicleFactoryMethod carFactory = new CarFactory();
        VehicleFactoryMethod bikeFactory = new BikeFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle bike = bikeFactory.createVehicle();

        System.out.println(car.drive());
        System.out.println(bike.drive());
    }
}