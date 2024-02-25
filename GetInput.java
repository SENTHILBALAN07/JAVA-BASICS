package com.senthilbalan;
import java.util.Scanner;
public class GetInput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("AGE: ");
        int age=scanner.nextInt();
        System.out.println("You are " +age +" years old");
    }
}
