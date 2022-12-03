package HW3.z5;

public class Human {
    private int age;
    private String name;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info(){
        System.out.println(getName()+" "+getAge()+" "+getWeight());
    }

    public static class HumanBuilder {
        private Human human = new Human();

        public HumanBuilder age(int age1) {
            human.setAge(age1);
            return this;
        }
        public HumanBuilder name(String name1){
            human.setName(name1);
            return this;
        }

        public HumanBuilder weight(double weight1){
            human.setWeight(weight1);
            return this;
        }
        public Human build(){
            return human;
        }
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();

    }
}
