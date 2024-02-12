package Opgave04;

public class Opgave04Main {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));

    }

    public static String reverse(String s) {
        if (s.isEmpty() || s.length() == 1)
            return s;

        String answer = s.substring(s.length() - 1);
        return answer + reverse(s.substring(0, s.length() - 1));
    }
}
