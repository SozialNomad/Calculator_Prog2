package calcAdv;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    static void main(String[]args){
        List<Calculation> history = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Operator: ");
            String op;
            op = scan.next();
            Operation operation = Factory.createOperation(op);
            int a;
            int b = 0;
            double result;

            if (operation instanceof UnaryOperation uop) {

                // hier kommen trig / sqrt etc.
                System.out.print("Enter the number: ");
                a = scan.nextInt();

                result = uop.operate(a);

                System.out.println(result);

                // b kannst du 0 lassen oder null, je nachdem wie deine Calculation ist
                Calculation calc = new Calculation(op, a, b, result);
                history.add(calc);

            }
            else if (operation instanceof BinaryOperation bop) {

                if (op.equals("log")) {
                    System.out.print("Enter the base: ");
                    a = scan.nextInt();

                    System.out.print("Enter the number: ");
                    b = scan.nextInt();

                } else if (op.equals("w")) {
                    System.out.print("Enter the number: ");
                    a = scan.nextInt();

                    System.out.print("Enter the root: ");
                    b = scan.nextInt();

                } else {
                    System.out.print("Enter first number: ");
                    a = scan.nextInt();

                    System.out.print("Enter second number: ");
                    b = scan.nextInt();
                }

                result = bop.operate(a, b);

                System.out.println(result);

                Calculation calc = new Calculation(op, a, b, result);
                history.add(calc);

            } else {
                System.out.println("Unknown operation type.");
                continue;
            }

            System.out.println("Press \"d\" then \"enter\" for done, press \"p\" then \"enter\" for the next calculation.");
            String isItDone = scan.next();
            if(isItDone.equals("d")){
                break;
            }
        }

        for (Calculation c : history) {
            System.out.println(c);
        }

        OptionalDouble avg = history.stream()
                .mapToDouble(m -> m.getResult())
                .average();
        System.out.println("average: " + avg.orElse(0.0));

        OptionalDouble min = history.stream()
                .mapToDouble(Calculation::getResult)
                .min();

        OptionalDouble max = history.stream()
                .mapToDouble(Calculation::getResult)
                .max();

        System.out.println("min: " + min.orElse(0.0));
        System.out.println("max: " + max.orElse(0.0));



    }
}
