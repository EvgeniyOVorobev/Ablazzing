package HW4.z3;

public abstract class CarShopDecorator implements Shop {
    protected Car car;

    public CarShopDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void showPrice() {
        car.showPrice();


    }
}
