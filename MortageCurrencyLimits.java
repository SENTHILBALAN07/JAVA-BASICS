package com.senthilbalan;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCurrencyLimits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int p=0;
        while (true) {
            System.out.print("PRINCIPLE =");
            p = scanner.nextInt();
            if ((p > 1000 && 0 < 10000000 == true))
                break;
                System.out.println("Enter the value between 1k$-1m$ ");

        }
        float AnnualIntrestRate=0;
        while (true) {
            System.out.print("AnnualIntrestRate =");
            AnnualIntrestRate = scanner.nextFloat();
            if((AnnualIntrestRate>=0)&&(AnnualIntrestRate<30))
                break;
            System.out.println("Enter the value between 0 to 29");

        }
        int periods=0;
        while (true) {
            System.out.print("periods =");
            periods = scanner.nextInt();

            if ((periods>0)&&(periods<=30))
                break;
            System.out.println("Enter the values between 1 to 30");
        }
        double r = (((AnnualIntrestRate) / 100) / 12);
        int n = ((periods * 12));
        double Mortage = (double) (p * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));
        String currency = NumberFormat.getCurrencyInstance().format(Mortage);
        System.out.println("The value of Mortage is" + currency);
    }
}
