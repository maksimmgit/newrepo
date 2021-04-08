package home_work_2.loops;

import java.util.Scanner;

public class HwOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLong()){
            long i = sc.nextLong();
            System.out.println(calculation(i));
        }
        else if(sc.hasNextDouble()){
            System.out.println("Введено не целое число");
        }
        else if(sc.hasNextLine()) {
            System.out.println("Введено не число");
        }
    }
    public static long calculation(long a){
        String st = String.valueOf(a);
        long result = 1;
        for(int i = 0; i< st.length(); i++){
            result = result * Integer.parseInt(String.valueOf(st.charAt(i)));
            if(i<st.length()-1) {
                System.out.print(st.charAt(i) + " * ");
            }
            else{
                System.out.print(st.charAt(i) + " = " );
            }
        }

        return result;
    }
}
