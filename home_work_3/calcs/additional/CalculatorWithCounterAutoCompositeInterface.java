package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{
    private ICalculator iCalculator;
    public long count;
    public void incrementCountOperation(){
        count++;
    }
    public long getCountOperation(){
        return this.count;
    }

    public CalculatorWithCounterAutoCompositeInterface (ICalculator iCalculator){
        this.iCalculator = iCalculator;
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return iCalculator.divide(a, b);
    }

    @Override
    public double mult(double a, double b) {
        incrementCountOperation();
        return iCalculator.mult(a,b);
    }

    @Override
    public double subt(double a, double b) {
        incrementCountOperation();
        return iCalculator.subt(a,b);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return iCalculator.addition(a,b);
    }

    @Override
    public double pow(double a, double b) {
        incrementCountOperation();
        return iCalculator.pow(a,b);
    }

    @Override
    public void abs(double a) {
        incrementCountOperation();
        iCalculator.abs(a);
    }

    @Override
    public double root(double a, double b) {
        incrementCountOperation();
        return iCalculator.root(a,b);
    }
}
