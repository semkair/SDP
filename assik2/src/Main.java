abstract class Vehicle {
    public abstract String drive();
}

class Car extends Vehicle {
    @Override
    public String drive() {
        return "Driving a car ";
    }
}

class Bike extends Vehicle {
    @Override
    public String drive() {
        return "Riding a bike ";
    }
}

abstract class VehicleFactoryMethod {
    public abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactoryMethod {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactoryMethod {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

