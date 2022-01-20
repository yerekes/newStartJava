public class Variable {
    public static void main(String[] args) {
        byte intelCore = 5;
        short memory = 4;
        int graphics = 5000;
        long graphicsMemory = 1536;
        float processor = 1.4f;
        double version = 11.6;
        char firstLetterSerial = 'C';
        boolean memoryCard = memory <= 128;
        System.out.println("Intel Core i" + intelCore);
        System.out.println("Оперативная память " + memory);
        System.out.println("Графика" + graphics);
        System.out.println("Память графика " + graphicsMemory);
        System.out.println("Процессор " + processor);
        System.out.println("Версия " + version);
        System.out.println("Первая буква серийнего " + firstLetterSerial);
        System.out.println("Больше ли оперативная память 128и? " + memoryCard);
    }
}