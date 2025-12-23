package calcAdv.operations;

import calcAdv.Visitor;

public class Mult extends BinaryOperation<Integer> {
    public double operate(Integer a, Integer b){
        return a * b;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
