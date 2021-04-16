package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double pow = 2;
        double result11 = calc.addition(calc.addition(a,calc.mult(b,c)), calc.pow(calc.divide(d,e),pow));
        System.out.println(result11);
        System.out.println(calc.count);
    }
}
