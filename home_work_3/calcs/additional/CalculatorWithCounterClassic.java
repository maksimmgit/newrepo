package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    public long count; //необязательно инициализировать
    public void incrementCountOperation(){
        count++;
    }
    public long getCountOperation(){
        return this.count;
    }//добавил this. когда к  пемеренной this не ставим

}
