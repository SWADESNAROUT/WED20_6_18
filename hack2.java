import java.util.*;
public class hack2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        System.out.println("enter N:");
        int N = sc.nextInt();

        for(int i= 1; i<11 ; i++)
        {
           int K = N*i;
            System.out.println(N + "*" + i + "=" + K);
           // System.out.println(K );
        }
    }
}
