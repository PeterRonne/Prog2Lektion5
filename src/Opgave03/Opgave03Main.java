package Opgave03;

public class Opgave03Main {

    public static void main(String[] args) {
        System.out.println(power(2, 5));

    }

//    public static int power(int n, int p) {
//        if (p == 0)
//            return 1;
//
//        return power(n, (p - 1)) * n;
//    }

    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else if (p % 2 == 0) {
            int temp = power(n, p / 2);
            return temp * temp;
        } else {
            return power(n, p - 1) * n;
        }
    }

//    public static int power(int n, int p) {
//        if (p == 0)
//            return 1;
//
//        int temp = power(n, p / 2);
//        if (p % 2 == 0)
//            return temp * temp;
//        else
//            return temp * temp * n;
//    }

}
