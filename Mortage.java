package com.senthilbalan;
// Mortage calculator project
import java.text.NumberFormat;
import java.util.Scanner;
public class Mortage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PRINCIPLE =");
        int p = scanner.nextInt();
        System.out.print("AnnualIntrestRate =");
        float AnnualIntrestRate = scanner.nextFloat();
        System.out.print("periods =");
        int periods = scanner.nextInt();
        double r = (((AnnualIntrestRate) / 100) / 12);
        int n = ((periods * 12));
        double Mortage = (double) (p * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));
        String currency = NumberFormat.getCurrencyInstance().format(Mortage);
        System.out.println("The value of Mortage is" + currency);
    }
}