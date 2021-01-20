import java.util.Scanner;

class MatSomaColK
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int k = s.nextInt();
        int soma = 0, n = 0, coiso;

        int [][]  matriz = new int [l][l];

        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                coiso = s.nextInt();
                matriz[i][j] = coiso;
                if (j == k)
                {
                    soma += coiso;
                }
            }
        }


        System.out.println(soma);

    }
}

