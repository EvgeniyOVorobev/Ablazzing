package HW4.z1;

public class Duck implements CanFly {
    private boolean isInjured;

    public Duck() {
    }

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() {
        try {
            if (isInjured) {
                throw new FlyException("Ошибка: утка ранена");
            }
            System.out.println("Утка летит");
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }


    }
}
