package HW3.z3;

public class PineTee implements Tree,Smell{


    @Override
    public void smell() {
        System.out.println("умеет пахнуть");

    }

    @Override
    public void cone() {
        System.out.println("имеет шишки");
    }
}
