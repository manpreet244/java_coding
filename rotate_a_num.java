import java.util.*;

public class rotate_a_num {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;// number of digits

        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        // change k in special cases
        // Case 1) if k is larger;
        k = k % nod;
        // ----------count number of digits--------------
        // Case 2) If k is -ve;
        if (k < 0) {
            k = k + nod;// k=-3 means k = +2
        }

        // ----------------------------------------------
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            // get divisor and multiplier from k help
            // i.e. if n=25938,div = 100, multipler =100
            // so rotated number = rem *multiplier +quotient;
            // = 98 * 100 +253
            // =98253
            // ---get divisor and multilplier----
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        // ------------------------------------
        int q = n / div;
        int rem = n % div;
        int rotated = rem * mult + q;
        System.out.println(rotated);

    }
}