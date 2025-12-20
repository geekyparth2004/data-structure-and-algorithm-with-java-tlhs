import java.util.Scanner;
public class Check
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        if(n % 3 == 0 || n % 5 == 0) System.out.println("Divisible");
        else System.out.println("Not Divisible");
    }
}