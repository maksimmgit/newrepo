package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    //все как прежде
    private final ICalculator calc;
    public long count;

    public double memory; //в неё сохраняется результат последнего метода при вызове
    public double tempMemory;


    public CalculatorWithMemory(ICalculator calculator) {
        this.calc = calculator;
    }

    public void toMemory(){
        this.memory = this.tempMemory;
    }


    public double getMemory(){
        double result = this.memory;
        this.memory = 0;
        return result;
    }


    @Override
    public double divide(double a, double b) {
        this.tempMemory = calc.divide(a, b);
        return this.tempMemory;
    }

    @Override
    public double mult(double a, double b) {
        this.tempMemory = calc.mult(a,b);
        return this.tempMemory;
    }

    @Override
    public double subt(double a, double b) {
        this.tempMemory = calc.subt(a,b);
        return this.tempMemory;
    }

    @Override
    public double addition(double a, double b) {
        this.tempMemory = calc.addition(a,b);
        return this.tempMemory;
    }

    @Override
    public double pow(double a, double b) {
        this.tempMemory = calc.pow(a, b);
        return this.tempMemory;
    }

    @Override
    public double abs(double a) {
        this.tempMemory = calc.abs(a);
        return this.tempMemory;
    }

    @Override
    public double root(double a, double b) {
        this.tempMemory = calc.root(a, b);
        return this.tempMemory;
    }
}
