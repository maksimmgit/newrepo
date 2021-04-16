package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    public long count;
    public void incrementCountOperation(){
        count++;
    }
    public long getCountOperation(){
        return this.count;
    }
    @Override
    public double pow(double a, double b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public void abs(double a) {
        incrementCountOperation();
        super.abs(a);
    }

    @Override
    public double root(double a, double b) {
        incrementCountOperation();
        return super.root(a, b);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    @Override
    public double mult(double a, double b) {
        incrementCountOperation();
        return super.mult(a, b);
    }

    @Override
    public double subt(double a, double b) {
        incrementCountOperation();
        return super.subt(a, b);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }
}
