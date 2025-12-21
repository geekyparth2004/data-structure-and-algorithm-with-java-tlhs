import java.util.*;

public class Sum_of_all_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int sum = 0;

        for(int i = 1; i <= n ; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}