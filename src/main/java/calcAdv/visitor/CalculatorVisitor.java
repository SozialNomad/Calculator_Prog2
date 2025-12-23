package calcAdv;

import calcAdv.operations.*;
import calcAdv.operations.basic.Addition;
import calcAdv.operations.basic.Division;
import calcAdv.operations.basic.Mult;
import calcAdv.operations.basic.Subtraction;
import calcAdv.operations.scientific.*;

import java.util.List;

public class CalculatorVisitor implements Visitor{
    public void validieren(List<Operation<?>> ops) {
        for (Operation<?> operation : ops) {
            operation.accept(this);
        }
    }

    @Override
    public void visit(Addition addition) {
        System.out.println("Validiere Addition");
        // hier könntest du Regeln prüfen
        // z.B. overflow, null-Checks, etc.
    }
    @Override
    public void visit(Subtraction subtraction) {
        System.out.println("Subtraction OK");
    }

    @Override
    public void visit(Division division) {
        System.out.println("Division prüfen");
    }

    @Override
    public void visit(Wurzel wurzel) {
        System.out.println("Wurzel prüfen (a >= 0)");
    }

    @Override
    public void visit(Logarithmus log) {
        System.out.println("Logarithmus prüfen (base > 0, != 1)");
    }

    @Override
    public void visit(Mult mult) {

    }

    @Override
    public void visit(Potenz potenz) {

    }

    @Override
    public void visit(Cos cos) {

    }

    @Override
    public void visit(Tan tan) {

    }

    @Override
    public void visit(Sin cos) {

    }
}
