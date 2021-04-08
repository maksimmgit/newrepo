package classwork;

import java.util.Scanner;

public class ClassWork4lineOrInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int A = 65;
        int Z = 90;
        int a = 97;
        int z = 122;
        if(code>=A && code <= Z || code>=a && code <=z){
            System.out.println("Код символа является буквой " + (char)code);
        }else{
            System.out.println("Это символ " + (char)code);
        }

    }
}
