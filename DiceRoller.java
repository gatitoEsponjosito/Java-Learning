import java.util.Random;

public class DiceRoller {
    private Random random;
    private int number;

    DiceRoller() {
        this.random = new Random();
        this.number = 0;
        roll();
    }

    void roll() {
        this.number = random.nextInt(7);
        System.out.println(number);
    }
}
