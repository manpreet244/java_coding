
import java.util.*;

public class prime_facorization {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }
        // if the div is beyond root n ,then "div" will be "n" itself (23 in case)
        // case : 2 |46
        // 23 |23
        // |1
        if (n != 1) {
            System.out.print(n + " ");
        }
    }

}