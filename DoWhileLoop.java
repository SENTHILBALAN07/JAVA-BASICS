package com.senthilbalan;
import java.lang.invoke.VarHandle;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args){
        do {
            String input = "";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!"input".equals("QUIET")) ;
    }
}
