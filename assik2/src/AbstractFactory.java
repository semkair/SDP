public class AbstractFactory {
    public static void main(String[] args) {
        VehicleFactory electricFactory = new ElectricFactory();
        VehicleFactory gasolineFactory = new GasolineFactory();

        System.out.println("=== Electric Car ===");
        CarAssembler electricCar = new CarAssembler(electricFactory);
        electricCar.assemble();

        System.out.println("\n=== Gasoline Car ===");
        CarAssembler gasolineCar = new CarAssembler(gasolineFactory);
        gasolineCar.assemble();
    }
}