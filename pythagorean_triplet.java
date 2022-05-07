import java.util.*;

public class pythagorean_triplet {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int k;
        k = a > b ? a > c ? a : c : b > c ? b : c;
        if (k == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (k == b) {
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        } else {
            boolean flag = ((b * b + a * a) == (c * c));
            System.out.println(flag);

        }

    }
}