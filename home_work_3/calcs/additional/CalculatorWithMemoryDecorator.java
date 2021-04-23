package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private double memory;
    private double tempMemory;
    private final ICalculator calc;
    public CalculatorWithMemoryDecorator(ICalculator calc){
        this.calc = calc;
    }

    public ICalculator getCalculator(){
        return this.calc;
    }

    public void toMemory(){
        this.memory = this.tempMemory;
    }

    public double getMemory(){
        double result = this.memory;
        this.memory = 0;
        return result;
    }

    public double divide(double a, double b) {
        this.tempMemory = calc.divide(a, b);
        return this.tempMemory;
    }

    public double mult(double a, double b) {
        this.tempMemory = calc.mult(a,b);
        return this.tempMemory;
    }

    public double subt(double a, double b) {
        this.tempMemory = calc.subt(a,b);
        return this.tempMemory;
    }

    public double addition(double a, double b) {
        this.tempMemory = calc.addition(a,b);
        return this.tempMemory;
    }

    public double pow(double a, double b) {
        this.tempMemory = calc.pow(a, b);
        return this.tempMemory;
    }

    public double abs(double a) {
        this.tempMemory = calc.abs(a);
        return this.tempMemory;
    }

    public double root(double a, double b) {
        this.tempMemory = calc.root(a, b);
        return this.tempMemory;
    }
}
