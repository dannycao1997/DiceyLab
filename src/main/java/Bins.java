import java.util.HashMap;

//Instructions : Create a tracking class Bins that can be used to track these results.

public class Bins {
    private HashMap<Integer, Integer> bins = new HashMap<>();


    //CONSTRUCTOR
    public Bins(int startBin, int endBin) { // start = 2 and end = 12
        bins = new HashMap<>();
        for (int i = startBin; i <= endBin; i++) { // 2 to 12
            bins.put(i, 0);
        }
    }

    public Integer getBin(int binNumber) {
        return bins.getOrDefault(binNumber, 0);
    }

    public Integer incrementBin(int binNumber) {
        return bins.put(binNumber, bins.getOrDefault(binNumber, 0) + 1);
    }
    public static void main(String[] args){
        Bins results = new Bins(2, 12);
        results.incrementBin(10);
    }
}



