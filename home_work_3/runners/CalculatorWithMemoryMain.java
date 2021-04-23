package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.pow(calc.divide(28,5), 2);
        calc.toMemory();
        calc. addition(calc.getMemory(), 4.1);
        calc.toMemory();
        calc.addition(calc.mult(15, 7 ),  calc.getMemory());
        calc.toMemory();
        System.out.println("Ответ = " + calc.getMemory());
    }
}
