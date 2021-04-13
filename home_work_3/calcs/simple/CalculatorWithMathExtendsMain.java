package home_work_3.calcs.simple;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double pow = 2;
        double result11 = calc.addition(calc.addition(a,calc.mult(b,c)), calc.pow(calc.divide(d,e),pow));
        System.out.println(result11);

    }
}
