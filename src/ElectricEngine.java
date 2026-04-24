public class ElectricEngine extends Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine started");
    }

    @Override
    public void stop() {
        this.setInternalSpeed(0);
        System.out.println("Electric Engine stopped");
    }

    @Override
    public void setInternalSpeed(int speed) {
        while (this.getInternalSpeed() < speed) {
            this.increase();
            System.out.println("Electric Engine current speed " + this.getInternalSpeed());
        }
        while (this.getInternalSpeed() > speed) {
            this.decrease();
            System.out.println("Electric Engine current speed " + this.getInternalSpeed());
        }


    }

}
