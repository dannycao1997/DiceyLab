//Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
//Create a simulation where two dies are thrown one million times. Keep track of all results.

public class Simulation { //instance fields
    public int numberOfDies; // numbers of dies
    public int numberOfTosses; // number of  tosses
    public Bins results; // results of bins
    public Simulation(int numberOfDies, int numberOfTosses) { //CONSTRUCTOR
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.results = new Bins(2 * numberOfDies, 6 * numberOfDies);
    }
    public void runSimulation() {
        Dice dice = new Dice(numberOfDies);
        for (int i = 0; i < numberOfTosses; i++) { // LOOP
            int sum = dice.tossAndSum(); // return int sum
            results.incrementBin(sum);
        }
    }
    public String printResults() {
        StringBuilder sb = new StringBuilder(); // string builder method
        sb.append("Simulation of ").append(numberOfTosses).append(" tosses with ").append(numberOfDies).append(" dice.\n");
        for (int i = numberOfDies; i <= 6 * numberOfDies; i++) { // rolling 1 to 6
            sb.append(String.format("%2d : %8d: %.2f ", i, results.getBin(i), (double) results.getBin(i) / numberOfTosses)); // percentage
            for (int j = 0; j < (double) results.getBin(i) / numberOfTosses * 100; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();  // convert numbers back to a string
    }
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000); // ex: rolling 2 dice => 1 million times lol
        sim.runSimulation();
        System.out.println(sim.printResults()); // PRINT OUT THE RESULTS TO CONSOLE
    }
}




