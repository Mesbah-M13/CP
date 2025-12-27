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

        System.out.println(set01);
    }
}