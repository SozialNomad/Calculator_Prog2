package calcAdv;

import calcAdv.operations.BinaryOperation;

public class Logarithmus extends BinaryOperation<Integer> {
    public double operate(Integer base, Integer number){
        double answer;
        if(base == Math.E){
            answer = Math.log(number);
            return answer;
        }
        answer = Math.log(number) / Math.log(base);
        return answer;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
