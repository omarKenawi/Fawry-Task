public abstract class Engine {
    private int internalSpeed = 0;

    abstract void start();

    abstract void stop();

    int getInternalSpeed() {
        return internalSpeed;
    }

    abstract void setInternalSpeed(int speed);

    void increase() {
        internalSpeed++;
    }

    public void decrease() {
        if (internalSpeed > 0)
            internalSpeed--;
    }

}
