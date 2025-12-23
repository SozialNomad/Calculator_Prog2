package calcAdv;

public class Calculation<T extends Number> {
    String operator;
    T a;
    T b;
    double result;

    public Calculation(String operator, T a, T b, double result){
        this.operator = operator;
        this.a = a;
        this.b = b;
        this.result = result;
    }
    public String getOperator(){
        return operator;
    }

    public T getA(){
        return a;
    }

    public T getB(){
        return b;
    }

    public double getResult(){
        return result;
    }

    public String toString(){
        switch (operator) {
            case "log" -> {
                return "log base " + a + " of " + b + " = " + result;
            }
            case "w" -> {
                if (b.equals(2)) return "the " + b + "nd root of " + a + " = " + result;
                if (b.equals(3)) return "the " + b + "rd root of " + a + " = " + result;
                return "the " + b + "th root of " + a + " = " + result;
            }
            case "sin","cos","tan" -> {
                return operator + a + " = " + result;
            }
        }
        return  a + " " + operator + " " + b + " = " + result;
    }
}
