package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;



public class CalculatorWithCounterAutoComposite {
    public long count;
    public void incrementCountOperation(){
        count++;
    }
    public long getCountOperation(){
        return this.count;
    }
    public int type;

    /*
    Объявление полей классов, которым делегируем расчёт.
     */
    private CalculatorWithOperator withOperator;
    private CalculatorWithMathCopy withMathCopy;
    private CalculatorWithMathExtends withMathExtends;

    public CalculatorWithCounterAutoComposite (CalculatorWithOperator calctype) {
        type = 1;
        this.withOperator = calctype;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy calctype) {
        type = 2;
        this.withMathCopy = calctype;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends calctype) {
        type = 3;
        this.withMathExtends = calctype;
    }


    /*
    if(calc1 != null){
    return calc1.plus(a,b)
    }else if (calc 2!= null){
    retunr calc2.plus(a,b)}
    else{
    retunr calc3.plus(a,b)
    }

     */
    public double divide(double a, double b){
        incrementCountOperation();
        if(type == 1){
            return withOperator.divide(a,b);
        }else if(type == 2){
            return withMathCopy.divide(a,b);
        }else
            return withMathExtends.divide(a,b);
    }
    public double mult(double a, double b){
        incrementCountOperation();
        if(type == 1){
            return withOperator.mult(a,b);
        }else if(type == 2){
            return withMathCopy.mult(a,b);
        }else
            return withMathExtends.mult(a,b);
    }

    public double subt(double a, double b){
        incrementCountOperation();
        if(type == 1){
            return withOperator.subt(a,b);
        }else if(type == 2){
            return withMathCopy.subt(a,b);
        }else
            return withMathExtends.subt(a,b);
    }

    public double addition(double a, double b){
        incrementCountOperation();
        if(type == 1){
            return withOperator.addition(a,b);
        }else if(type == 2){
            return withMathCopy.addition(a,b);
        }else
            return withMathExtends.addition(a,b);
    }

    public double pow(double a, double b){
        incrementCountOperation();
        if(type == 1){
            return withOperator.pow(a,b);
        }else if(type == 2){
            return withMathCopy.pow(a,b);
        }else
            return withMathExtends.pow(a,b);
    }


    //Это криво или сделать возвращаемым?
    public void abs(double a){
        incrementCountOperation();
        if(type == 1){
            withOperator.abs(a);
        }else if(type == 2){
            withMathCopy.abs(a);
        }else
            withMathExtends.abs(a);


    }

    public double root(double a, double b){
        incrementCountOperation();
        if(type == 1){
            return withOperator.root(a,b);
        }else if(type == 2){
            return withMathCopy.root(a);
        }else
            return withMathExtends.root(a,b);
    }

}
