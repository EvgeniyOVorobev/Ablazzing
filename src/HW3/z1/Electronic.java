package HW3.z1;

public abstract class Electronic {
    private boolean vkl;

    public void on() {
        this.vkl = true;
    }

    public void off() {
        this.vkl = false;
    }
    abstract void work();

}
