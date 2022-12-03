package HW1;

public class Main {
    public static void main(String[] args) {
        //
        double weight = 72;
        double height = 1.8;
        double i = weight / Math.pow(height, 2);
        System.out.println(i);
        //

        int ageChildren = 22;
        if (ageChildren < 6) {
            System.out.println("Идёшь в сад");
        } else if (ageChildren < 11 & ageChildren >= 6) {
            System.out.println("Идёшь в младшую школу");
        } else if (ageChildren < 17 & ageChildren >= 11) {
            System.out.println("Идёшь в среднюю школу");
        } else System.out.println("Идёшь в университет");
        //

        boolean chicken = false;
        boolean vegetables = false;
        boolean sour = false;
        boolean toast = false;
        boolean sausage = false;
        boolean eggs = true;
        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && sausage || chicken && eggs) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощьной");
        } else System.out.println("У меня ничего нет");
        //

        String a = "234";
        int b = Integer.parseInt(a);
        String c = "some_text";
        int length = c.length();
        System.out.println(b + length);
        //

        int a1 = 3;
        int b1 = 5;
        System.out.println(Math.pow((double) a1 + (double) b1, 2));
        //

        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        double disc = 1;
        double price = 0;
        int problem = 0;
        if (!hasFuel && hasElectricsProblem && hasWheelsProblem && hasMotorProblem && hasTransmissionProblem) {
            System.out.println("с вас 1000");
        }
        if (hasMotorProblem) {
            price = price + 10000;
            problem++;

        }
        if (hasElectricsProblem) {
            price = price + 5000;
            problem++;
        }
        if (hasTransmissionProblem) {
            price = price + 4000;
            problem++;
        }
        if (hasWheelsProblem) {
            price = price + 2000;
            problem++;
        }

        if (problem == 2) {
            disc = 0.9;
        }
        if (hasElectricsProblem || hasMotorProblem && hasTransmissionProblem) {
            disc = 0.8;
        }
        System.out.println(problem);
        System.out.println(price = disc * price);

    }
}