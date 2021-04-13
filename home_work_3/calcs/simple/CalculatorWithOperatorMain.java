package home_work_3.calcs.simple;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double pow = 2;
        double result = calc.addition(calc.addition(a,calc.mult(b,c)), calc.pow(calc.divide(d,e),pow));
        System.out.println(result);
    }
}
