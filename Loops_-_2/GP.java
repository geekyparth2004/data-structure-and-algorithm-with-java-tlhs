import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt(); 

        for(int i = 1; i<= n ; i++)
        {
            System.out.print(a);
            System.out.print(" ");
            a = a * r;
        }
    }
}