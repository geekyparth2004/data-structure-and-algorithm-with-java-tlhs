import java.util.Scanner;
public class Profit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost = sc.nextInt();
        int sell = sc.nextInt();

        if(sell - cost > 0) System.out.println("Profit");
        else if(sell - cost < 0) System.out.println("Loss");
        else System.out.println("No Profit No Loss");
    }
}