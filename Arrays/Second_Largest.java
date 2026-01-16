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

        int mx = Integer.MIN_VALUE; 

        for(int i = 0 ; i < n ; i++)
        {
            if(mx < arr[i]) mx = arr[i]; 
        }

        
        int smx = Integer.MIN_VALUE; 

        for(int i = 0 ; i < n ; i++)
        {
            if(smx < arr[i] && arr[i] != mx) smx = arr[i]; 
        }

        System.out.println(smx);
        return;
    }
}