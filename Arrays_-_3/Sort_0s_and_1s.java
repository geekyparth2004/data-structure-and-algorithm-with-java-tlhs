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

        // Method 1

        // int noz = 0 , noo = 0; 

        // for (int i = 0; i < n; i++) {
        //     if(arr[i] == 0) noz++;
        //     else noo++;
        // }

        // for (int i = 0; i < noz; i++) {
        //     arr[i] = 0;
        // }

        // for (int i = noz ; i < n; i++){
        //     arr[i] = 1;
        // }

        // Method 2

        int i = 0 , j = n-1;

        while(i < j)
        {
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(arr[i] == 1 && arr[j] == 0) 
            {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }

    }
}