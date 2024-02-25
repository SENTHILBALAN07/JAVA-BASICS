package com.senthilbalan;
public class AndNotOperator {
    public static void main(String[] args){
        boolean hasGoodCredit=true;
        boolean hasHighIncome=false;
        boolean hasCriminalRecord=false;
        boolean isEligible=((hasGoodCredit||hasHighIncome)&&!hasCriminalRecord);
        System.out.println(isEligible);
    }
}
