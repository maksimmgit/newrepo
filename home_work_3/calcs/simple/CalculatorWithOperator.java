package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {



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



/*
второй вариант


double result = 1;
for(int i = 1;i < b; i++){
result*=a;
return result;
}
 */
    public double pow(double a, double b){
        if (b == 1){
            return a;
        }
        int y;
        double result = a;
        int x = 1;
        while(x<b){
            result = result*a;
            x++;
        }
        return result;
    }

    /**
     * Использование тернарного оператора

     */
    public void abs(double a){
        a = (a<0?-a:a);
    }

    /**
     * Извлечение любого корня. При отрицательном a и чётном b операция невозможна.

     */
    public double root(double a, double b){
        if(a<0 && b%2 == 0){
            System.out.println("Ошибка");
            return 0;
        }else {
            return Math.pow(a, (1 / b));
        }
    }
}