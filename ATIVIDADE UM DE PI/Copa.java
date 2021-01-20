import java.util.Scanner;

public class Copa

{
    public static void main (String[]args)

    {
    Scanner s = new Scanner (System.in);

    int N, C, M, Cont, i, j;

    N = s.nextInt();
    C = s.nextInt();
    M = s.nextInt();
    Cont = C;
    
    int Rara[] = new int [C];
    int Total[] = new int [M];

    for( i =0; i<C; i++)
    {
       Rara[i] = s.nextInt();
    }

    for( i =0; i<M; i++)
    {
       Total[i] = s.nextInt();
    }

    for( i=0; i<C; i++)
    {
        for( j =0; j<M; j++)
        {
            if (Rara[i] == Total[j])
            {
                Cont -= 1;
                break;
            }
        }
    }

     System.out.println(Cont);
    }
}