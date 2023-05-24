public class Main {
 
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }
 
    public static void main(String[] args) {
 
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
