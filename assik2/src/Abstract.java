abstract class Engine {
    public abstract String start();
}

abstract class Tire {
    public abstract String roll();
}

class ElectricEngine extends Engine {
    @Override
    public String start() {
        return "Electric engine starts silently ";
    }
}

class ElectricTire extends Tire {
    @Override
    public String roll() {
        return "Eco-friendly tire rolls ";
    }
}

class GasolineEngine extends Engine {
    @Override
    public String start() {
        return "Gasoline engine starts with a roar ";
    }
}

class GasolineTire extends Tire {
    @Override
    public String roll() {
        return "All-terrain tire rolls ";
    }
}

abstract class VehicleFactory {
    public abstract Engine createEngine();
    public abstract Tire createTire();
}

class ElectricFactory extends VehicleFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Tire createTire() {
        return new ElectricTire();
    }
}

class GasolineFactory extends VehicleFactory {
    @Override
    public Engine createEngine() {
        return new GasolineEngine();
    }

    @Override
    public Tire createTire() {
        return new GasolineTire();
    }
}

class CarAssembler {
    private final Engine engine;
    private final Tire tire;

    public CarAssembler(VehicleFactory factory) {
        this.engine = factory.createEngine();
        this.tire = factory.createTire();
    }

    public void assemble() {
        System.out.println(engine.start());
        System.out.println(tire.roll());
    }
}

