package HW5.advanced;

import HW5.base.FinancialRecord;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        FinancialRecord[] financialRecords = {
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000)),
                new FinancialRecord(random.nextInt(1000), random.nextInt(1000))};
        String filename = "C:\\Users\\Z\\Ablazzing\\src\\report_2.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true))) {
            for (FinancialRecord i : financialRecords
            ) {
                bufferedWriter.write(i.getOutcomes() + " " + i.getIncomes() + "\n");
            }
        }
        int income = 0;
        int outcome = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] s = line.split(" ");
                income += Integer.parseInt(s[0]);
                outcome += Integer.parseInt(s[1]);
            }
        }
        System.out.println("Общие доходы: " + income + ",общие расходы: " + outcome);


    }


}
