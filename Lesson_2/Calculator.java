public class Calculator {
    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void calculate() {
        switch(mathOperation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '^':
                pow();
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
            default:
                System.out.println("Not math operation");

        }

    }

    private void pow(){
        int resultPow = 1;
        for (int i = 1; i <= secondNumber; i++) {
            resultPow *= firstNumber;
        }
        System.out.println(resultPow);

    }

}
