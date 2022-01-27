import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        int si, p, t, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter P, T, R");
        p = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }
}