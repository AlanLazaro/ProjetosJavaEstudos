import java.util.Scanner;

class Sator
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        while(l != 0)
        {


            int c =0;
            boolean Teste= true;

            String [][]  matriz = new String [l][l];
            String [] vetor1 = new String [l*l];
            String [] vetor2 = new String [l*l];


            for(int i = 0; i < l; i++)
            {
                for(int j = 0; j < l; j++)
                {
                    matriz[i][j] = s.next();
                    vetor1[c] = matriz[i][j];
                    c++;

                }
            }

            c= 0;

            for(int i = l-1; i >= 0; i--)
            {
                for(int j = l-1; j >= 0; j--)
                {
                    vetor2[c] = matriz[i][j];
                    c++;

                }
            }

            for(int i=0; i < l*l; i++)
            {
               Teste &= vetor1[i].equals(vetor2[i]);
            }

           System.out.printf("%s%n", Teste ? "S" : "N");
           
            l = s.nextInt();

        }

    }
}