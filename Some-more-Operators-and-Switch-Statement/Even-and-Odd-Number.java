import java.util.Scanner;
class even
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        String s = n%2==0 ? "Even" : "Odd";

        System.out.println(s);
    }
}