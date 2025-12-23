package calcAdv;

import calcAdv.operations.BinaryOperation;

public class Wurzel extends BinaryOperation<Integer> {
    @Override
    public double operate(Integer x, Integer n){
        return Math.pow(x, 1.0/n);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
