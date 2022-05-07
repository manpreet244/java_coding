import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = Integer.parseInt(scn.nextLine());// when u want int and string type
        // in same program
        System.out.println("Enter name");
        String name = scn.nextLine();
        System.out.println("Hello " + name);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

}