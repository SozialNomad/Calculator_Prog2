package calcAdv;

import calcAdv.operations.BinaryOperation;

public class Potenz extends BinaryOperation<Integer> {
    @Override
    public double operate(Integer a, Integer b){
        return Math.pow(a,b);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
