package calcAdv;

public class CantDivideZeroException extends RuntimeException {
    public CantDivideZeroException(String message) {
        super(message);
    }
    public CantDivideZeroException(String message, Throwable t) {
        super(message, t);
    }
}
