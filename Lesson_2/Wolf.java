public class Wolf {
    private char male;
    private String name;
    private int mass;
    private int age;
    private char color;

    public void move() {
        System.out.println("moving");
    }

    public void sitDown() {
        System.out.println("Down");
    }

    public void run() {
         System.out.println("Running");
    }

    public void voice() {
         System.out.println("Voicing");
    }

    public void hunt() {
         System.out.println("Hunting");
    }

    public char getMale() {
        return male;
    }

    public void setMale(char male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age <= 8){
            this.age = age;
        } else {
            System.out.println("Yекоректная информация");
        }
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
