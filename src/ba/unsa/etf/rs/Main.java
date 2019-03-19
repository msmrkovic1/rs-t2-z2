package ba.unsa.etf.rs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        System.out.println("Enter a number: ");

        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();

        for (int i=1; i<=n; i++)
        if(i % sumaCifara(i) == 0) System.out.print(i + ", ");

    }

    private static int sumaCifara(int n) {
        int s=n;
        int sum=0;

        while(s!=0) {
            sum+=s%10;
            //System.out.println("sum: " + sum);
            s=s/10;
            //System.out.println("s: " + s);
        }

        return sum;
    }
}
