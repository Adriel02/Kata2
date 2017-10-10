import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        Integer [] data = {1,1,1,100,2,4,5,6,8,8};
        Histogram histo= new Histogram(data);
        Map<Integer,Integer>histogr = histo.getHistogram();

        for (Integer key : histogr.keySet()) {
            System.out.println(key+" --> "+histogr.get(key));
        }
    }
}
