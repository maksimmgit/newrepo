package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public static void main(String[] args) {

    }
    public double divide(double a, double b){
        return a/b;
    }
    public double mult(double a, double b){
        return a*b;
    }

    public double subt(double a, double b){
        return a-b;
    }
    public double addition(double a, double b){

        return a+b;
    }

    public double pow(double a, double b){
        return Math.pow(a,b);
    }

    public void abs(double a){
        Math.abs(a);
    }

    @Override
    public double root(double a, double b) {
        if(a<0 && b%2 == 0){
            System.out.println("Ошибка");
            return 0;
        }else {
            return Math.pow(a, (1 / b));
        }
    }

    public double root(double a){
        return Math.sqrt(a);
    }
}
