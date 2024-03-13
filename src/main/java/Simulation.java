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


    public void runSimulation(){
        for (int i = 0; i < numberOfTosses; i++){
            int tossResult = dice.tossAndSum();
            results.incrementBin(tossResult);
        }
    }



    public void printResults(){
        System.out.println("BRUHHHH");
        for( int i = numberOfDies; i <= numberOfDies * 6; i++){




    }
}


