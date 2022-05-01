import java.util.Scanner;

public class PrintNToOne {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        printNToOne(sc.nextInt());

    }

    public static void printNToOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);

    }
}
