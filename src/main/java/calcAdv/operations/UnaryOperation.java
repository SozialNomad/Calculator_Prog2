package calcAdv;

public abstract class UnaryOperation<T extends Number> extends Operation<T>{
    public abstract double operate(T a);
}
