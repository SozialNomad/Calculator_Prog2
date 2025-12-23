package calcAdv;

import calcAdv.operations.UnaryOperation;

public class Cos extends UnaryOperation<Integer> {
    @Override
    public double operate(Integer a) {
        double radians = Math.toRadians(a);
        return Math.cos(radians);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
