package home_work_1;

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
        byte positive = 0;
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
                numberar[i] = number % 2;
                number = (byte) (number / 2);
                i++;
            }
            String temp = "";
            for (int m = numberar.length - 1; m >= 0; m--) {
                if(numberar[m] == 0) {
                    temp += "1";
                }
                else if(numberar[m] == 1){
                    temp += "0";
                }
               // Дальше не разобрался как прибавить 1 к полученному числу с учётом переноса единиц.

            }

        }
        return realnumber;
    }

}
