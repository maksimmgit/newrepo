package home_work_3.runners;
import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Scanner;
public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoCompositeInterface withOperator = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());//
        CalculatorWithCounterAutoCompositeInterface withMathCopy = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoCompositeInterface withMathExtends = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());
        Scanner sc = new Scanner(System.in);
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double pow = 2;
        System.out.println("Выберите тип калькулятора:");
        System.out.println("Для CalculatorWithOperator введите 1");
        System.out.println("Для CalculatorWithMathCopy введите 2");
        System.out.println("Для CalculatorWithMathExtends введите 3");
        int choose = sc.nextInt();
        if(choose == 1){
            double result11 = withOperator.addition(withOperator.addition(a,withOperator.mult(b,c)), withOperator.pow(withOperator.divide(d,e),pow));
            System.out.println(result11);
            System.out.println(withOperator.count);
        }else if(choose == 2){
            double result11 = withMathCopy.addition(withMathCopy.addition(a,withMathCopy.mult(b,c)), withMathCopy.pow(withMathCopy.divide(d,e),pow));
            System.out.println(result11);
            System.out.println(withMathCopy.count);
        }else if(choose == 3){
            double result11 = withMathExtends.addition(withMathExtends.addition(a,withMathExtends.mult(b,c)), withMathExtends.pow(withMathExtends.divide(d,e),pow));
            System.out.println(result11);
            System.out.println(withMathExtends.count);
        }else{
            System.out.println("Проверьте ваш ввод.");
        }

    }
}
