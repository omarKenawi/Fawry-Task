public class CarFactory {
    public static Car createCar(EngineType type){
        Engine engine = EngineFactory.createEngine(type);
        return new Car(engine);
    }
}
