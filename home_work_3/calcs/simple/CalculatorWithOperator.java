package home_work_3.calcs.simple;

public class CalculatorWithOperator {



    public double divide(double a, double b){
        return a/b;
    }
    public double mult(double a, double b){
        return a*b;
    }

    public double subt(double a, double b){

        return 0;
    }
    public double addition(double a, double b){

        return a+b;
    }

    /**
     *  @param a
     * @param b
     * @return
     */
    public double pow(double a, double b){
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
     * @param a
     */
    public void abs(double a){
        a = (a<0?-a:a);
    }

    /**
     * Извлечение корня. При отрицательном a и чётном b операция невозможна.
     * @param a
     * @param b
     */
    public static double root(double a, double b){
        if(a<0 && b%2 == 0){
            System.out.println("Ошибка");
            return 0;
        }else {
            return Math.pow(a, (1 / b));
        }
    }
}