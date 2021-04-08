package classwork;

import java.util.Random;

public class Wk1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(20);
        int b = rnd.nextInt(20);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int answerCode = checkCorrectData(a,b); //параметры

        switch (answerCode){
            case 1:
                System.out.println("Оба числа не могут быть четными");
                break;
            case 2:
                System.out.println("Оба числа не могут быть нечетными");
                break;
        }
        if(answerCode == 0){
            System.out.println(getOddNumber(a, b));
        }

    }
    /** Данный метод
      * проверяет на корректность.
      * @param c  число
      * @param j  число
      * @return 0  все ок
      **/
    public static int checkCorrectData(long c, long j){
        //c, j - аргументы
        boolean checkC = c % 2 == 0;
        boolean checkJ = c % 2 == 0;

        if(checkC && checkJ){
            return 1;
        } else if(!checkC && !checkJ){
            return 2;
        }
        return 0;
    }

    /**
    * @param var1
    * @param var2
     **/
    public static int getOddNumber(int var1, int var2){
        if(var1%2 != 0){
            return var1;
        } else {
            return var2;
        }
    }
}
