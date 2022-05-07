import java.util.*;

public class inverse_a_num {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int inv = 0;
        int inverse_digit = 1;
        while (n != 0) {
            // gives last digit
            int inverse_position = n % 10;

            inv = inv + inverse_digit * (int) Math.pow(10, inverse_position - 1);
            n = n / 10;
            inverse_digit++;
        }
        System.out.println(inv);
    }
}