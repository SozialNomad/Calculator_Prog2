package calcAdv.operations;

import calcAdv.CantDivideZeroException;
import calcAdv.Visitor;

public class Division extends BinaryOperation<Integer> {
    @Override
    public double operate(Integer a, Integer b){
        try{
            return a / b;
        }catch (ArithmeticException e){
            throw new CantDivideZeroException("not allowed to divide to zero", e);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
