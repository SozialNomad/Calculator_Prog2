package calcAdv;

import calcAdv.operations.UnaryOperation;

public class Tan extends UnaryOperation<Integer> {
    public double operate(Integer a){
        double radians = Math.toRadians(a);
        return Math.tan(radians);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
