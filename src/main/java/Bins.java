import java.util.HashMap;
import java.util.Map;
//Instructions : Create a tracking class Bins that can be used to track these results.
public class Bins {
    private final HashMap<Integer, Integer> results;

    public Bins(int x, int y) {
        results = new HashMap<>();
        for(int i = x; i <= y; i++){
            results.put(i,0);
        }
    }

    public void incrementBin(int bin) {
    results.put(bin, results.get(bin) + 1 );
    }

    public int getBin(int bin) {
        return results.get(bin);
    }
}


