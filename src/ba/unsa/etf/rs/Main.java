package ba.unsa.etf.rs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        System.out.println("Enter a number: ");

        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();

        for (int i=1; i<=n; i++)
        if(n % sumaCifara(i) == 0) System.out.print(n + ", ");

    }

    private static int sumaCifara(int n) {
        int sum=0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }

        return sum;
    }
}
