package algorithms.implementation;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2) {
            return (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));   // YES
        System.out.println(kangaroo(0, 2, 5, 3));   // NO
    }
}
