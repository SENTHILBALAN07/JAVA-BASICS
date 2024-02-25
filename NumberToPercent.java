package com.senthilbalan;

import java.text.NumberFormat;

public class NumberToPercent {
    public static void main(String[] args){
        String result= NumberFormat.getPercentInstance().format(190);
        System.out.println(result);


    }
}
