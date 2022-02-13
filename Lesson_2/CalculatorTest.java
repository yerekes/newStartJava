import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Calculator is starting");

        String answer = "yes";


        while(answer.equals("yes")) {
            System.out.print("Choose your first number ");
            int firstNumber = scanner.nextInt();
            calc.setFirstNumber(firstNumber);

            System.out.print("Choose your Math operation ");
            String text = scanner.next();
            char mathOperation = text.charAt(0);
            calc.setMathOperation(mathOperation);

            System.out.print("Choose your SECOND number ");
            int secondNumber = scanner.nextInt();
            calc.setSecondNumber(secondNumber);


            calc.calculate();

            do {
                System.out.println("Can u next? [yes / no]: ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }

        System.out.println("Calculator has ending");
    }
}