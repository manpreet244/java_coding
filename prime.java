import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n = 37;
        boolean isPrime = true;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
