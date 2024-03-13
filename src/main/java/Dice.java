import java.util.Random;


// Instructions : Create a Dice class that acts like a set of N random-tossed dies.
// 6 sides on each die
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

        for ( int i = 0; i < numDice; i++) { // rolling 2 dice
            sum += random.nextInt(6)+ 1; //
        }
        return sum;
    }
}
