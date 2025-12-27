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

        String country = "Bangladesh";

//        search or lookup operation for any pair using map_name.containsKey()
        if(countryMap.containsKey("Bangladesh")){
            System.out.println("Key is in the map");
        }else{
            System.out.println("Not included");

        }
//      to find out the value related to the key use get()
        System.out.println("Population of " + country + " is :" + countryMap.get("Bangladesh"));
        System.out.println(countryMap.get("Iraq"));
    }
}