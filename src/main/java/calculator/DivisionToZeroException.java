package calculator;

public class DivisionToZeroException extends RuntimeException {
  public DivisionToZeroException(String message) {
    super(message);
  }
}
