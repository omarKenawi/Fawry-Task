public class car {
    private static final int MAX_SPEED = 200;
    private int speed = 0;
    private Engine engine;

    public car(Engine engine) {
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
        if (this.speed < MAX_SPEED) {
            this.speed = Math.min(MAX_SPEED, this.speed + 20);
            engine.setSpeed(speed);
        }
    }

    public void brake() {
        if (this.speed > 0) {
            this.speed = Math.max(0, this.speed - 20);
            engine.setSpeed(speed);
        }
    }
}
