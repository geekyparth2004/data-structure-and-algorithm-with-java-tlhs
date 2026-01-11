import java.util.*;

public class Main {
    public static void odd(int x)
    {
        if(x % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        odd(n);
    }
}