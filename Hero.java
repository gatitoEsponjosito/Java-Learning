
public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + power;
    }

    public static void main(String[] args) {
        Hero hero1 = new Hero("Juan", 14, "Volar");
        System.out.println(hero1.toString());
    }
}
