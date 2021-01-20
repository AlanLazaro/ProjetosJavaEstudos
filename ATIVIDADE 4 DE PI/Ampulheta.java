import java.util.Scanner;

class Ampulheta
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        int matriz[][] = new int [6][6];
        int Soma = 0;

        
        for(int i = 0; i < 6; i++)
         {
            for(int j = 0; j < 6; j++)
            {
                matriz[i][j] = s.nextInt();
            }

         }
         
         int Maior =  matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[1][1] + matriz[2][0] + matriz[2][1] + matriz[2][2];
         
         for(int i = 0; i < 4; i++)
         {
            for(int j = 0; j < 4; j++)
            {
                Soma = matriz[i][j] + matriz[i][j+1] + matriz[i][j+2] + matriz[i+1][j+1] + matriz[i+2][j] + matriz[i+2][j+1] + matriz[i+2][j+2];
                if(Soma > Maior)
                Maior = Soma;
            }

         }
         
         System.out.println(Maior);
    }
}