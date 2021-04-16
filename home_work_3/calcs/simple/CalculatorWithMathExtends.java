package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double pow(double a, double b) {
        return super.pow(a, b);
    }

    @Override
    public void abs(double a) {
        super.abs(a);
    }

    @Override
    public double root(double a, double b) {
        return super.root(a, b);
    }
}

