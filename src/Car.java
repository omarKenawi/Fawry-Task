public class Car {
    private static final int MAX_SPEED = 200;
    private int speed = 0;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        if (speed < MAX_SPEED) {
            speed = Math.min(MAX_SPEED, speed + 20);
            engine.setInternalSpeed(speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed = Math.max(0, speed - 20);
            engine.setInternalSpeed(speed);
        }
    }
    public int getSpeed(){
        return speed;
    }
}
