import java.util.HashSet;

public class HashSetUsage {
    public static void main(String[] args) {

//        hashset creation
        HashSet<Integer> set01 = new HashSet<>();
//    hashset creation is similar to arrayList. ArrayList<Integer> list = new ArrayList<>()

        set01.add(10);
        set01.add(20);
        set01.add(30);
        set01.add(40);

//        System.out.println(set01);

//        print the size of a hashset
        System.out.println("My hashset size is : " + set01.size());

//        search or look up any value using .contains()
      /*
        if(set01.contains(40)) {
            System.out.println("Number is in the set");
        }if(!set01.contains(33)) {
            System.out.println("Number is not in the set");
        }

       */
//         remove an element from the set
        set01.remove(30);
        if(!set01.contains(30)){
            System.out.println("30 is deleted");
        }
        System.out.println("New value of hashset is : " + set01);
        System.out.println("New size of my hashset is : " + set01.size());

        }
}