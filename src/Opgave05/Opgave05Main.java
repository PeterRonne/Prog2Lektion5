package Opgave05;

public class Opgave05Main {
    public static void main(String[] args) {
        System.out.println(sfd(36,48));
    }
    public static int sfd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sfd(b, a % b);
        }
    }
}
