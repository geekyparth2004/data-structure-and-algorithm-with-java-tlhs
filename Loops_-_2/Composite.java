import java.util.*;

public class Composite {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt(); 
       int x = 0;
       for(int i = 2; i <= n -1 ; i++)
       {
            if(n % i == 0){
                System.out.println("Yes");
                x = 1;
                break;
            }
       }

       if(x == 0) System.out.println("No");
    }
}