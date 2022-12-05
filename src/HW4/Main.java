package HW4;

import HW4.z1.CanFly;
import HW4.z1.Duck;
import HW4.z1.Plane;
import HW4.z2.Brand;
import HW4.z2.Shop;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(10);
        Plane plane1 = new Plane(-1);
        Duck duck = new Duck();
        Duck duck1 = new Duck(true);
        CanFly[] canfle = {plane1, plane, duck1, duck};
        for (CanFly i : canfle
        ) {
            i.fly();
        }
        System.out.println();
        //


        Brand[] brands={new Shop(false),new Shop(true)};












    }
}
