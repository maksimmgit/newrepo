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

    /*
    Объявление полей классов, которым делегируем расчёт.
     */
    private CalculatorWithOperator withOperator;
    private CalculatorWithMathCopy withMathCopy;
    private CalculatorWithMathExtends withMathExtends;

    public CalculatorWithCounterAutoComposite (CalculatorWithOperator calctype) {
        this.withOperator = calctype;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy calctype) {
        this.withMathCopy = calctype;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends calctype) {
        this.withMathExtends = calctype;
    }



    public double divide(double a, double b){
        incrementCountOperation();
        if(withOperator != null){
            return withOperator.divide(a,b);
        }else if(withMathCopy != null){
            return withMathCopy.divide(a,b);
        }else
            return withMathExtends.divide(a,b);
    }
    public double mult(double a, double b){
        incrementCountOperation();
        if(withOperator != null){
            return withOperator.mult(a,b);
        }else if(withMathCopy != null){
            return withMathCopy.mult(a,b);
        }else
            return withMathExtends.mult(a,b);
    }

    public double subt(double a, double b){
        incrementCountOperation();
        if(withOperator != null){
            return withOperator.subt(a,b);
        }else if(withMathCopy != null){
            return withMathCopy.subt(a,b);
        }else
            return withMathExtends.subt(a,b);
    }

    public double addition(double a, double b){
        incrementCountOperation();
        if(withOperator != null){
            return withOperator.addition(a,b);
        }else if(withMathCopy != null){
            return withMathCopy.addition(a,b);
        }else
            return withMathExtends.addition(a,b);
    }

    public double pow(double a, double b){
        incrementCountOperation();
        if(withOperator != null){
            return withOperator.pow(a,b);
        }else if(withMathCopy != null){
            return withMathCopy.pow(a,b);
        }else
            return withMathExtends.pow(a,b);
    }



    public void abs(double a){
        incrementCountOperation();
        if(withOperator != null){
            withOperator.abs(a);
        }else if(withMathCopy != null){
            withMathCopy.abs(a);
        }else
            withMathExtends.abs(a);


    }

    public double root(double a, double b){
        incrementCountOperation();
        if(withOperator != null){
            return withOperator.root(a,b);
        }else if(withMathCopy != null){
            return withMathCopy.root(a);
        }else
            return withMathExtends.root(a,b);
    }

}
