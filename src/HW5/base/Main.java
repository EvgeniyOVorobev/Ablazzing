package HW5.base;


import HW5.base.FinancialRecord;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filemane="C:\\Users\\Z\\Ablazzing\\src\\my_first_file";
       try( BufferedReader bufferedReader = new BufferedReader(new FileReader(filemane))){
        String result="";
        while (bufferedReader.ready()){
            String line=bufferedReader.readLine();
            result+=line+" ";
        }
        System.out.println(result);}


        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        String report="C:\\Users\\Z\\Ablazzing\\src\\report.txt";
       try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(report))){
        bufferedWriter.write("Доходы= "+financialRecord.getIncomes()+", расходы= "+financialRecord.getOutcomes());}

    }
}