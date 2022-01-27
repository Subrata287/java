import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        int a, b, c, larg, check;
        Scanner sc = new Scanner(System.in);
        System.out.println("A Enter first No: ");
        a = sc.nextInt();
        System.out.println("B Enter Second No: ");
        b = sc.nextInt();
        System.out.println("C Enter third No: ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is largest Value: " + a);
            } else {
                System.out.println("C is largest Value: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("B is largest Value: " + b);
            } else {
                System.out.println("C is largest Value: " + c);
            }
        }
    }
}