import java.util.Random;


// Create a Dice class that acts like a set of N random-tossed dies.
// rolling a 1 die = singular
// rolling a 2 dice = plural
public class Dice {
    private final int numDice;
    private final Random random;

    public Dice(int numDice) {
        this.numDice = numDice;
        this.random = new Random();
    }
    public int tossAndSum(){
        int sum = 0;

        for ( int i = 0; i < numDice; i++) {
            sum += random.nextInt(6)+ 1;
        }
        return sum;
    }
}
