package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {


    private final ICalculator calc;
    private long count;


    public CalculatorWithCounterAutoDecorator(ICalculator calc){
        this.calc = calc;
    }


    public ICalculator getCalculator(){
        return this.calc;
    }


    public void incrementCountOperation(){
        count++;
    }
    public long getCountOperation(){
        return this.count;
    }



    public double divide(double a, double b) {
        incrementCountOperation();
        return calc.divide(a,b);
    }

    public double mult(double a, double b) {
        incrementCountOperation();
        return calc.mult(a,b);
    }

    public double subt(double a, double b) {
        incrementCountOperation();
        return calc.subt(a,b);
    }

    public double addition(double a, double b) {
        incrementCountOperation();
        return calc.addition(a,b);
    }

    public double pow(double a, double b) {
        incrementCountOperation();
        return calc.pow(a,b);
    }

    public double abs(double a) {
        incrementCountOperation();
        return calc.abs(a);
    }

    public double root(double a, double b) {
        incrementCountOperation();
        return calc.root(a,b);
    }
}
