public class HybridEngine extends Engine {
    private final GasEngine gasEngine = new GasEngine();
    private final   ElectricEngine electricEngine = new ElectricEngine();
    private Engine operatingEngine;


    @Override
    public void start() {
        System.out.println("Engine started");
        operatingEngine = electricEngine;
        operatingEngine.start();
    }

    @Override
    public void stop() {
        operatingEngine.stop();
    }


    @Override
    public void setInternalSpeed(int speed) {
        Engine selectedEngine;
        if (speed<=50)  selectedEngine = electricEngine;
        else selectedEngine=gasEngine;

        //make sure the Car started
        if (operatingEngine==null){
            operatingEngine=selectedEngine;
            operatingEngine.start();
        }
        //change engines if needed
        if(selectedEngine!=operatingEngine){
            operatingEngine.stop();
            selectedEngine.start();
            operatingEngine=selectedEngine;
        }
        operatingEngine.setInternalSpeed(speed);
    }

}
