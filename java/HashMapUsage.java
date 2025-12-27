import java.util.*;

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> countryMap = new HashMap<>();

//insert values
        countryMap.put("Bangladesh", 20);
        countryMap.put("China", 180);
        countryMap.put("Australia", 10);

        System.out.println(countryMap);
        countryMap.put("China",200);
        System.out.println(countryMap);

//        search or lookup operation for any pair using map_name.containsKey
        if(countryMap.containsKey("Bangladesh")){
            System.out.println("Bangladesh is there");
        }else{
            System.out.println("Not included");
        }
    }
}