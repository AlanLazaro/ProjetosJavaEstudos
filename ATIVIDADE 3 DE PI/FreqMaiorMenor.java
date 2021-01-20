import java.util.Scanner;

class FreqMaiorMenor
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int c = s.nextInt();
        double maior =0, menor=0, contMaior =0, contMenor =0;
        int [][]  matriz = new int [l][c];
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matriz[i][j] = s.nextInt();
                if(i == 0 && j == 0)
                {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }
                
                else
                {
                    if(matriz[i][j] > maior)
                    {
                        maior = matriz[i][j];
                    }
                    
                    if(matriz[i][j] < menor)
                    {
                        menor = matriz[i][j];
                    }
                }
                
            }
        }
        
         for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(matriz[i][j] == maior)
                {
                    contMaior += 1;
                }
                if(matriz[i][j] == menor)
                {
                    contMenor += 1;
                }
            }
        }
        
        System.out.printf("%.0f %.2f%%\n",menor,contMenor/(l*c)*100);
        System.out.printf("%.0f %.2f%%\n",maior,contMaior/(l*c)*100);
    }
}