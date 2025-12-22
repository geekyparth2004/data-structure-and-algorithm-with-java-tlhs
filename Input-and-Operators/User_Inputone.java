import java.util.Scanner;

public class User_Inputone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading a single character
        char a = sc.next().charAt(0);
        
        // Reading a word (single string without spaces)
        String k = sc.next();
        
        // To read a line (potentially with spaces), use nextLine(). 
        // Since next() leaves the newline character in the buffer, call nextLine() to clear it first
        sc.nextLine(); // Consume the leftover newline
        String val = sc.nextLine();
        
        // Reading integer, float, double, and boolean values
        int n = sc.nextInt();
        float v = sc.nextFloat();
        double d = sc.nextDouble();
        boolean t = sc.nextBoolean();

        // Printing each value
        System.out.println(a);
        System.out.println(k);
        System.out.println(val);
        System.out.println(n);
        System.out.println(v);
        System.out.println(d);
        System.out.println(t);

        sc.close();

    }
}