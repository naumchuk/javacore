package com.kitcenter.app.homework;

/**
 * Created by marketing1 on 17-Sep-17.
 */
public class Plus {
    public static int pluss (int a, int b){
        int c = 0;
        for(int i=0; i<10; i++){
          c = a + i + b*i;
        }
        return c;
    }
}
