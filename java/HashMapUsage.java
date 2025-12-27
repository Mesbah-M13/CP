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
/*
//        search or lookup operation for any pair using map_name.containsKey()
        if(countryMap.containsKey("Bangladesh")){
            System.out.println("Key is in the map");
        }else{
            System.out.println("Not included");

        }
//      to find out the value related to the key use get()
        System.out.println("Population of " + country + " is :" + countryMap.get("Bangladesh"));
        System.out.println(countryMap.get("Iraq")); // null

//        iteration in hashmap general idea --> for( variable_data_type value : collection ) ; collection = bunch of values

        int[] arr = {34, 53, 2};
                for ( int val : arr){
                    System.out.print(val +" ");
                }

//        in hashmpap --> for( Map.Entry<String,Integer>e : Map.entrySet())
//        iteration using entrySet() --> for( Map.Entry<String,Integer>e : Map.entrySet()) [ e = variable name ]
*/
        for( Map.Entry<String,Integer> d : countryMap.entrySet()) {
            System.out.println(d.getKey() + " : " + d.getValue());
//            System.out.println(d.getValue());
        }

//        iteration in hashmap using keySet()
        Set<String> keys = countryMap.keySet();
        for(String val: keys){
//            System.out.println(val + " value is > " + countryMap.get(val));
        }

//        remove value from a hashmap
        countryMap.remove("China");

        System.out.println(countryMap);
    }
}