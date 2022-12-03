package HW2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String f = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(f.repeat(3));
        //
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+"a ");
        }
        //
        System.out.println();
        Dog dog=new Dog("Sharik",14);
        Cat cat=new Cat("Mur",7);
        //
        double increment = 0.01123;
        double result = 0;
        long count = 0;
        // (int i = (int)result; i < 1000000; i++) {
        //  count++;
        //  result=result+increment;
        //}
        while (result < 1000000) {
            count++;
            result += increment;
        }
        System.out.println(result);
        //
        int[] arr = {1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
        //
        String h = "Hello world";
        String Hello = h.replaceAll("l", "r").toUpperCase().substring(0, 8);
        System.out.println(Hello);


    }
}
