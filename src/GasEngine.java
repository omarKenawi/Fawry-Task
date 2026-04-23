public class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Gas Engine stopped");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Gas Engine current speed " + speed);
    }
}
