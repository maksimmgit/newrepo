package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = sc.nextByte();
        System.out.println(toBinaryString(number));




    }
    public static String toBinaryString(byte number) {
        String realnumber = "";
        int[] numberar = new int[8];
        int i = 0;
        if(number >0) {
            while (number > 0) {
                numberar[i] = number % 2;
                number = (byte) (number / 2);
                i++;
            }

            for(int m = numberar.length - 1; m >= 0; m--) {
                realnumber += Integer.toString(numberar[m]);


            }
        }
        else if(number <0) {
            number = (byte) Math.abs(number);
            while (number > 0) {
                /*
                из-за кривого кода пришлось здесь реализовывать сразу правильную запись чисел в массив,
                а не разворот как при положительном числе выше.
                */
                numberar[numberar.length - 1 - i]  = number % 2;
                number = (byte) (number / 2);
                i++;
            }
            for (int n = 0; n < numberar.length; n++) {
                numberar[n] = numberar[n] == 1 ? 0 : 1;
            }
            for (int n = 0; n < numberar.length; n++) {
                if (numberar[numberar.length - 1 - n] == 0) {
                    numberar[numberar.length - 1 - n]=1;
                    break;
                }else{
                    numberar[numberar.length - 1 - n]=0;
                }
            }
            for (int j : numberar) {
                realnumber += j;
            }
        }
        return realnumber;
    }

}
