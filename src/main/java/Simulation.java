//Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
//Create a simulation where two dies are thrown one million times. Keep track of all results.


public class Simulation {
    public int numberOfDies;
    public int numberOfTosses;
    public Bins results;

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.results = new Bins(2 * numberOfDies, 6 * numberOfDies);
    }

    public void runSimulation() {
        Dice dice = new Dice(numberOfDies);
        for (int i = 0; i < numberOfTosses; i++) {
            int sum = dice.tossAndSum();
            results.incrementBin(sum);
        }
    }

    public String printResults() {
        StringBuilder sb = new StringBuilder();
        sb.append("***\n");
        sb.append("Simulation of ").append(numberOfTosses).append(" tosses with ").append(numberOfDies).append(" dice.\n");
        sb.append("***\n\n");
        for (int i = numberOfDies; i <= 6 * numberOfDies; i++) {
            sb.append(String.format("%2d : %8d: %.2f ", i, results.getBin(i), (double) results.getBin(i) / numberOfTosses * 100));
            for (int j = 0; j < (double) results.getBin(i) / numberOfTosses * 100; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        System.out.println(sim.printResults());
    }
}




