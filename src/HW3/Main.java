package HW3;


import HW3.z1.LenovoComputer;
import HW3.z2.Car;
import HW3.z2.Car1;
import HW3.z2.Car2;
import HW3.z3.*;
import HW3.z4.Warehouse;
import HW3.z4.Worker;
import HW3.z5.Human;

public class Main {

    public static void main(String[] args) {
        LenovoComputer lenovoComputer = new LenovoComputer();
        lenovoComputer.on();
        lenovoComputer.loadSystem();
        lenovoComputer.work();
        //
        Car[] car = {new Car1(), new Car1(), new Car2(), new Car2()};
        //
        Rose rose = new Rose();
        Fir fir = new Fir();
        PineTee pineTee = new PineTee();
        Fern fern = new Fern();
        Smell[] smell={rose,fir,pineTee};
        Plant[] plants={rose,fern};
        for (int i = 0; i < smell.length; i++) {
            smell[i].smell();
        }
        for (int i = 0; i < plants.length; i++) {
            plants[i].bloom();
        }
        //
        Warehouse warehouse=new Warehouse(22);
        Worker worker=new Worker();
        Worker worker1=new Worker();
        Worker worker2=new Worker();
        worker.work(warehouse);
        worker1.work(warehouse);
        worker2.work(warehouse);
        worker.work(warehouse);
        worker1.work(warehouse);
        worker2.work(warehouse);
        System.out.println(warehouse.getVodka());
        //
        Human human=new Human();
        Human.HumanBuilder humanBuilder=new Human.HumanBuilder();
        Human tom = humanBuilder.age(22).weight(77).name("Tom").build();
        tom.info();


    }
}
