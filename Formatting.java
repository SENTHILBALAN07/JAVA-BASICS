package com.senthilbalan;

import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args){
        // Number formatting to currency
        String result=NumberFormat.getCurrencyInstance().format(85);
        System.out.println(result);

    }




}
