package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {


    public static void main(String[] args) {
        CalculatorWithCounterClassic calc1 = new CalculatorWithCounterClassic();
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double pow = 2;

        double operation1 = calc1.divide(d,e);
        calc1.incrementCountOperation();
        double operation2 = calc1.pow(operation1, pow);
        calc1.incrementCountOperation();
        double operation3 = calc1.mult(b,c);
        calc1.incrementCountOperation();
        double operation4 = calc1.addition(operation3, a);
        calc1.incrementCountOperation();
        double operation5 = calc1.addition(operation4, operation2);
        calc1.incrementCountOperation();
        System.out.println(operation5);
        System.out.println(calc1.count);

    }



}
