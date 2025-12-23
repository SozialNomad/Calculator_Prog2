package calcAdv;

public class Factory {
    public static Operation<Integer> createOperation(String operator){
        return switch (operator) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "*" -> new Mult();
            case "/" -> new Division();
            case "^" -> new Potenz();
            case "log" -> new Logarithmus();
            case "w" -> new Wurzel();
            case "sin" -> new Sin();
            case "cos" -> new Cos();
            case "tan" -> new Tan();
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}
