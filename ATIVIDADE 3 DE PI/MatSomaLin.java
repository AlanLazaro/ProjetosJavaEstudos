import java.util.Scanner;

class MatSomaLin
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int soma = 0, n = 0, coiso;

        int [][]  matriz = new int [l][l];
        int []  vetor = new int [l];

        if(l > 0)
        {

            for(int i = 0; i < l; i++)
            {
                if (i > 0)
                {
                    vetor[i-1] = soma;
                }

                soma = 0;
                for(int j = 0; j < l; j++)
                {

                    coiso = s.nextInt();
                    matriz[i][j] = coiso;
                    soma += coiso;

                }
            }

            vetor[l-1] = soma;


            for(int i = 0; i < l; i++)
            {
                System.out.println(vetor[i]);
            }
        }

    }
}