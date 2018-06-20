import java.util.*;
import java.lang.*;
public class Queryhack3
{
    public static void main(String args[])
    {
        int a=0, b=0, n=0, q=0;
        int N=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter q:");

        q = sc.nextInt();
        for(int i=1 ; i <= q ; i++)
        {
            System.out.print("enter values of a,b,n");
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            N = N+a;

            // N = a + (b * (int)(Math.pow(2, 0)));
            for(int j=0; j<n ; j++)
            {
                N += (b * (int)(Math.pow(2, j)));

                System.out.print(N + " ");
                // System.out.print("\t");
            }
            N = 0;
            System.out.println();

        }



    }
}
