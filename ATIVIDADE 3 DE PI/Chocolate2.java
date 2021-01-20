
import java.util.Scanner;

class Chocolate2
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int c = s.nextInt();
        int soma = 0, cont = 0;

        int [][]  matriz = new int [l][c];

        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < c; j ++)
            {
                matriz[i][j] = s.nextInt();
            }
        }
        
        int dia = s.nextInt();
        int mes = s.nextInt();
        
        for(int i =0; i < l; i++)
        {
            for(int j =0; j < c - mes + 1; j++)
            {
                for(int k = 0; k < mes; k++)
                {
                    soma += matriz[i][j+k];
                }
                
                if(soma == dia)
                cont+=1;
                
                soma =0;
            }
        }
        
        for(int j =0; j < c; j++)
        {
            for(int i =0; i < l - mes + 1; i++)
            {
                for(int k = 0; k < mes; k++)
                {
                    soma += matriz[i+k][j];
                }
                
                if(soma == dia)
                cont+=1;
                
                soma =0;
            }
        }
        if(mes == 1)
        System.out.println(cont/2);
        
        else
        System.out.println(cont);
        

    }
}