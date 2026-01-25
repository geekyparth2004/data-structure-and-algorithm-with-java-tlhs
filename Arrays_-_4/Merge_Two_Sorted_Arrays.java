import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 

        int[] a = new int[n];
        int[] b = new int[m]; 
        
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0 ; i < m ; i++)
        {
            b[i] = sc.nextInt();
        }
        
        int[] c = new int[n+m]; 

        int i = 0;
        int j = 0; 
        int k = 0;

        while(i < a.length && j < b.length)
        {
            if(a[i] <= b[j])
            {
                c[k] = a[i];
                i++;
                k++;
            }

            else
            {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        if(i == a.length)
        {
            while(j < b.length)
            {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        else{
            while(i < a.length)
            {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        for(int ele : c)
        {
            System.out.print(ele + " ");
        }
    }
}