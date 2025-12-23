package calcAdv;

import calcAdv.operations.basic.Addition;
import calcAdv.operations.basic.Division;
import calcAdv.operations.basic.Mult;
import calcAdv.operations.basic.Subtraction;
import calcAdv.operations.scientific.*;

public interface Visitor {
    void visit(Addition addition);
    void visit(Subtraction subtraction);
    void visit(Division division);
    void visit(Wurzel wurzel);
    void visit(Logarithmus log);
    void visit(Mult mult);
    void visit(Potenz potenz);

    void visit(Cos cos);
    void visit(Tan tan);
    void visit(Sin cos);

}
