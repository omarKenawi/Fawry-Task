public class GasEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Gas Engine started");
    }

    @Override
    public void stop() {
        this.setInternalSpeed(0);
        System.out.println("Gas Engine stopped");
    }

    @Override
    public void setInternalSpeed(int speed) {
        while (this.getInternalSpeed() < speed) {
            this.increase();
            System.out.println("Gas Engine current speed " + this.getInternalSpeed());
        }
        while (this.getInternalSpeed() > speed) {
            this.decrease();
            System.out.println("Gas Engine current speed " + this.getInternalSpeed());
        }
    }
}
