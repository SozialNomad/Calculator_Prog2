package calcAdv.operations;

import calcAdv.Visitor;

public class Subtraction extends BinaryOperation<Integer> {
    @Override
    public double operate(Integer a, Integer b){
        return a - b;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
