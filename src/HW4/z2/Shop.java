package HW4.z2;

import HW4.z1.FlyException;

public class Shop implements Brand {


    public Shop(boolean tick) {
        Shop.Worker worker = new Worker(tick);


    }

    public static class Worker {
        public Worker(boolean tick) {
            Shop.Worker.Watch watch = new Watch(tick);
            watch.ticktack();
        }


        public static class Watch {
            public boolean tick;

            public Watch(boolean tick) {
                this.tick = tick;
            }


            public void ticktack() {
                try {
                    if (!tick) {
                        throw new WatchBrokenError("Ошибка: Часы сломались");
                    }
                    System.out.println("Часы тикают");
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }


        }
    }


}

