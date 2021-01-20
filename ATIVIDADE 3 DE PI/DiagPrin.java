import java.util.Scanner;

class DiagPrin
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int soma = 0, n = 0;

        int [][]  matriz = new int [l][l];
        int []  vetor = new int [l];
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                matriz[i][j] = s.nextInt();
                
            }
        }
        
         for(int i = 0; i < l; i++)
        {
            System.out.println(matriz[i][i]);
        }
    }
}