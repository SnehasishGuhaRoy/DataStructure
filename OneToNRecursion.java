import java.util.Scanner;

public class OneToNRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printOneToN(sc.nextInt());

    }

    public static void printOneToN(int n) {
        if (n == 0) {
            return;
        }
        printOneToN(n - 1);
        System.out.println(n);
    }
}
