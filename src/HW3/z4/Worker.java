package HW3.z4;

public class Worker {
    private int count;

    public Worker() {
        setCount(0);

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void work(Warehouse warehouse){
        warehouse.setVodka(warehouse.getVodka()-1);
        count++;
        System.out.println("Ура я испортил водку!");
        System.out.println(count);

    }
}
