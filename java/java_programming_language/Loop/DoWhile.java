//public class DoWhile {
//    public static void main(String[] args) {
//        int num = 10;
//        do{
//            System.out.println(num);
//            num++;
//        }while (num<20);
//    }
//}

// find the sum of n natural numbers

public class DoWhile {
    public static void main(String[] args) {

        int n = 4;
        int res = 0;

        while (n >=0) {
        res = res + n;
        n--;
        }
        System.out.println(res);
        }
}