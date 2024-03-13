import java.util.Random;



// Instructions : Create a Dice class that acts like a set of N random-tossed dies.
// 6 sides on each die
// rolling a 1 die = singular
// rolling a 2 dice = plural

public class Dice { // instance fields
    private final int numDice; // number of dice rolled
    private final Random random;

    public Dice(int numDice) { // constructor
        this.numDice = numDice;
        this.random = new Random(); // random number method
    }

    public int tossAndSum() {
        int sum = 0;

        for (int i = 0; i < numDice; i++) { // rolling 2 dice
            sum += random.nextInt(6) + 1; // highest dice number/upperbound is 6;
        }
        return sum;
    }
}

