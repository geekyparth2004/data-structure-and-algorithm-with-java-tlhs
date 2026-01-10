import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        int a = 1 , d = 2;

        for(int i = 1; i <= n ; i++)
        {
            System.out.print(a);
            System.out.print(" ");
            a = a + d;
        }
    }
}