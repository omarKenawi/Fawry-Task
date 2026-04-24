public abstract class Engine {
    private int internalSpeed = 0;

    abstract void start();

    abstract void stop();

    protected int getInternalSpeed() {
        return internalSpeed;
    }

    abstract void setInternalSpeed(int speed);

    protected void increase() {
        internalSpeed++;
    }

    protected void decrease() {
        if (internalSpeed > 0)
            internalSpeed--;
    }

}
