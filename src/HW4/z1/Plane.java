package HW4.z1;

public class Plane implements CanFly {
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() {

        try {
            if (countPassengers < 0) {
                throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
            }
            System.out.println("Самолёт летит");
        } catch (FlyException e) {
            System.out.println(e.getMessage());

        }

    }


}
