public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        char operation = '^';
        if(operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else if (operation == '^') {
            int resultPow = 1;
            for (int i = 1; i <= num2; i++) {
                resultPow *= num1;
            }
            System.out.println(resultPow);
        } else if (operation == '%') {
            System.out.println(num1 % num2);
        }
    }
}