import java.util.Scanner;
public class traingle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 

        if(a+b > c && b+c > a && a+c > b) System.out.println("Valid Triangle");
        else System.out.println("Not a valid triangle");
    }
}