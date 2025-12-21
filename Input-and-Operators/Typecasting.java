import java.util.Scanner;
public class Typecasting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double s = (double) n;

        System.out.println(n);
        System.out.println(s);
    }
}