package classwork;

import java.util.Random;

public class Classwork1MiddleThree {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(20);
        int b = rnd.nextInt(20);
        int c = rnd.nextInt(20);
        int answer = checkMiddle(a,b,c);


        switch (answer){
            case 1:
                System.out.println("Первое число среднее");
                break;
            case 2:
                System.out.println("Второе число среднее");
                break;
            default:
                System.out.println("Третье число среднее");
                break;
        }


    }

    /**
     *
     * @param x
     * @param y
     * @param z
     * @return 1 первое число среднее
     * @return 2 второе число среднее
     * @return 0 третье число среднее
     */
    public static int checkMiddle(int x, int y, int z){
        if((x > y && x < z) || (x < y && x > z)){
            return 1;
        } else if((y>x && y < z) || (y<x && y>z)){
            return 2;
        } else {
            return 0;
        }
    }
}
