import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            int x = sc.nextInt(); 
            arr.add(x);
        }

        arr.remove(2);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}