public class EngineFactory {
    public static Engine createEngine(EngineType type) {
        if (type == EngineType.GAS)
            return new GasEngine();
        else if (type == EngineType.ELECTRIC)
            return new ElectricEngine();
        else if(type==EngineType.HYBRID)
            return new HybridEngine();
        else throw new IllegalArgumentException();
    }
}
