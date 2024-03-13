public class Simulation {
    public final int numberOfDies;
    public final int numberOfTosses;
    public final Bins results;
    public final Dice dice;

    public Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.results = new Bins(numberOfDies, numberOfDies * 6);
        this.dice = new Dice(numberOfDies);
    }
    public void 
}
    public class main {
        public static void main(String[] args) {
            Simulation sim = new Simulation(2, 10000);
            sim.runSimulation;
            sim.printResults;
        }
    }


