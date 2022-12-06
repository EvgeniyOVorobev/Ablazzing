package HW4.z3;

public class Car implements Shop {
    public int getPrice() {
        return price;
    }

    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(price);


    }

}
