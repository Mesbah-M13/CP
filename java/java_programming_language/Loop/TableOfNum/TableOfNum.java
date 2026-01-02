import java.util.*;

//Print the table of a number input by the user
public class TableOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int multiply;
        for (int i = 1; i <= 10 ; i++) {
            multiply = inputNum*i;
            System.out.println(inputNum+"*"+i+ "="+multiply);
        }
    }
}