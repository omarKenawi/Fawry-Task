public class Main {

    public static void main(String[] args) {

        runGasolineTest();
        runElectricTest();
        runHybridTest();
        runEngineReplacementTest();

        System.out.println();
        System.out.println("All tests finished successfully");
        System.out.println("------------------------");
    }

    private static void runGasolineTest() {
        System.out.println();
        System.out.println("Gasoline Car Test");
        System.out.println("------------------------");

        Car car = CarFactory.createCar(EngineType.GAS);
        testBasicCarFlow(car);
    }

    private static void runElectricTest() {
        System.out.println();
        System.out.println("Electric Car Test");
        System.out.println("------------------------");

        Car car = CarFactory.createCar(EngineType.ELECTRIC);
        testBasicCarFlow(car);
    }

    private static void runHybridTest() {
        System.out.println();
        System.out.println("Hybrid Car Test");
        System.out.println("------------------------");

        Car car = CarFactory.createCar(EngineType.HYBRID);
        car.start();

        car.accelerate();
        car.accelerate();
        car.accelerate();

        car.brake();
        car.brake();

        System.out.println("Current speed: " + car.getSpeed());

        car.stop();
    }

    private static void runEngineReplacementTest() {
        System.out.println();
        System.out.println("Engine Replacement Test");
        System.out.println("------------------------");

        Car car = CarFactory.createCar(EngineType.GAS);

        car.start();
        car.accelerate();
        car.accelerate();

        System.out.println("Switching engine...");

        EngineFactory.replaceEngine(car, EngineType.HYBRID);

        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();

        car.stop();
    }

    private static void testBasicCarFlow(Car car) {

        car.start();

        car.accelerate();
        car.accelerate();

        car.brake();

        System.out.println("Current speed: " + car.getSpeed());

        car.stop();

        car.brake();

        System.out.println("Current speed: " + car.getSpeed());

        car.stop();
    }
}