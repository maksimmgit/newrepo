package classwork;

import java.util.Scanner;

public class ClassWork2DivideTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = dividingCheck(a,b);

        switch (answer){
            case 0:
                System.out.println("Делится нацело");
                System.out.println("Частное = " + a/b);
                break;
            case 1:
                System.out.println("Не делится нацело");
                System.out.println("Частное = " + a/b);
                System.out.println("Остаток = " + a%b);
                break;
        }

    }
    /**
     *
     * @param x
     * @param y
     * @return 0 Делится нацело
     * @return 1 Не делится нацело
     */
    public static int dividingCheck(int x, int y){
        if((double)x/y != 0) {
            return 1;
        } else if((double)x/y == 0){
            return 0;
        } else{
            return 1;
        }
/*
Чёт запутался. 55/87 выдаёт кривой результат.
 */
    }
}
