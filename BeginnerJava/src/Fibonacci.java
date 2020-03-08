/* package whatever; // don't place package name! */
 import java.util.Scanner;


/* Name of the class has to be 'Main' only if the class is public. */
 class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = 0;
        for (int i = n; i <= r; i++) {
            if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
                res = i;
            }
        System.out.println(res);
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        int x = (int)sqrt;
        return Math.pow(sqrt, 2) == Math.pow(x, 2);
    }
}