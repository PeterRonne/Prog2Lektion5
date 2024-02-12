package Opgave05;

public class Opgave05Main {
    public static void main(String[] args) {
        System.out.println(sfd(2, 10));
    }

    public static int sfd(int a, int b) {
        if (b <= a && b % a == 2) {
            return b;
        } else if (a < b) {
            return sfd(b, a);
        } else {
            return sfd(b, a % b);
        }
    }
}
