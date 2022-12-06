package HW4.z3;

public class CarShop extends CarShopDecorator {
    public CarShop(Car car) {
        super(car);
    }

    @Override
    public void showPrice() {

        showProceDecorator();
    }

    public void showProceDecorator() {
        try {
            if (car.getPrice() < 0) {
                throw new Exception("Здравствуй клиент, цена этого авто неизвестна мне");
            }
            System.out.print("Здравствуй клиент, цена этого авто ");
            super.showPrice();
            System.out.println("Хочешь купить авто?");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Давайте посмотрим другое авто?");
        }
    }
}





