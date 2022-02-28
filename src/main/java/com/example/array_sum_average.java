
package com.example;


public class array_sum_average {
    public static void main(String[] args) {
        int[] arrSumAvg = {5,7,9,6,4,8};
        int sum = 0;
        double len = arrSumAvg.length;
        for(int i = 0; i<len; i++){
            sum += arrSumAvg[i];
        }
        double avg = sum/len;
        System.out.println(avg);
    }
}
