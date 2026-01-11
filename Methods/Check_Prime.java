import java.util.*;

public class Main {
    public static boolean prime(int n)
    {
        int count = 0; 

        for(int i = 1 ; i <= n ; i++)
        {
            if(n%i == 0) count++;
        }

        if(count == 2) return true;
        else return false;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt(); 

       if(prime(n) == true) System.out.println("True");
       else System.out.println("False");
    }
}