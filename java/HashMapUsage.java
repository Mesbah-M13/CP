import java.util.*;

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> countryMap = new HashMap<>();

//insert values
        countryMap.put("Bangladesh", 20);
        countryMap.put("Chaina", 180);
        countryMap.put("Australia", 10);

        System.out.println(countryMap);
    }
}