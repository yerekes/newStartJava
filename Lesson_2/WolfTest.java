public class WolfTest {
    public static void main(String[] args) {
        Wolf alfa = new Wolf();
        alfa.setMale('M');
        alfa.setName("Nurzat");
        alfa.setMass(67);
        alfa.setAge(4);
        alfa.setColor('B');

        System.out.println(alfa.getMale());
        System.out.println(alfa.getName());
        System.out.println(alfa.getMass());
        System.out.println(alfa.getAge());
        System.out.println(alfa.getColor());

        alfa.move();
        alfa.run();
        alfa.sitDown();
        alfa.voice();
        alfa.hunt(); 
    }


}