package com.senthilbalan;

public class OrOperator {
    public static void main(String[] args){
        boolean hasHighIncome=false;
        boolean hasHighCredit=true;
        boolean isEligible=hasHighIncome||hasHighCredit;
        System.out.println(isEligible);
    }

}
