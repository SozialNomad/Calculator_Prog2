package calcAdv;

public abstract class Operation<T extends Number>{
    public abstract void accept(Visitor visitor);
}
