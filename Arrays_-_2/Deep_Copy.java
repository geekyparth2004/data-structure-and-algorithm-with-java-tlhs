import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] brr = arr; // shallow copy

        int[] crr = Arrays.copyOf(arr,arr.length);

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(crr[i] + " ");
        }
    }
}