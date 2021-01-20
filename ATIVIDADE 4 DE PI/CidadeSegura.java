import java.util.Scanner;

class CidadeSegura
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int Qtd = s.nextInt();
        int matriz[][] = new int [Qtd+1][Qtd+1];
        
        for(int i = 0; i < Qtd+1; i++)
         {
            for(int j = 0; j < Qtd+1; j++)
            {
                matriz[i][j] = s.nextInt();
            }

         }
         
         for(int i = 0; i < Qtd; i++)
         {
            for(int j = 0; j < Qtd; j++)
            {
                int Teste1 = (matriz[i][j] == 1) ? 1 : 0;
                int Teste2 = (matriz[i+1][j] == 1) ? 1 : 0;
                int Teste3 = (matriz[i][j+1] == 1) ? 1 : 0;
                int Teste4 = (matriz[i+1][j+1] == 1) ? 1 : 0;
                
                if(Teste1 + Teste2 + Teste3 + Teste4 > 1)
                System.out.print("S");
                
                else
                System.out.print("U");
            }
            
            System.out.println("");

         }
         
    }
}