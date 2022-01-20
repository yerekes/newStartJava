public class MyFirstGame {
    public static void main(String[] args) {
        int num = 68;
        int random = 66;
        while(num != random) {
            if(num > random) {
                System.out.println("Данное число больше того, что загадал компьютер " + num);
                num--;
            } else if(num < random) {
                System.out.println("Данное число меньше того, что загадал компьютер " + num);
                num++;
            } 
            System.out.println("Введите число повторно");
        }
        System.out.println("Поздравляю, число угадано!");
    }
}