package com.senthilbalan;

public class SwitchOperator {
    public static void main(String[] args){
        String role="Senthilbalan";

        switch (role) {
            case "admin":
                System.out.println("You role is admin");
                break;
            case "manager":
                System.out.println("You role manger");
                break;
            default:
                System.out.println("guest");
        }
    }
}
