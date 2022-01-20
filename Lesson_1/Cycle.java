public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i < 21; i++) {
            System.out.println(i);
        }
        
        int num1 = -6;
        while(num1 <= 6) {
            System.out.println(num1);
            num1 += 2;
        }

        int num2 = 10;
        int sumOdd = 0;
        do {
            if(num2 % 2 == 1) {
                sumOdd += num2;
            }
            num2++;
        } while(num2 <= 20);
        System.out.println(sumOdd);
    }
}