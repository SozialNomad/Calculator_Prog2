package calcAdv;

public abstract class BinaryOperation<T extends Number> extends Operation<T> {
    public abstract double operate(T a, T b);
}
