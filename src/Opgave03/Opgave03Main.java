package Opgave03;

public class Opgave03Main {

    public static void main(String[] args) {
        System.out.println(power(2,4));

    }
    public static int power(int n, int p) {
        if (p == 0)
            return 1;

        return power(n, (p-1)) * n;
    }
}
