import java.util.Scanner;

class Loteria
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int Contador=0, Quadra=0, Quina=0, Sena=0;
        int Qtd = s.nextInt();
        int matriz [][] = new int [Qtd+1][6];


         for(int i = 0; i < Qtd+1; i++)
         {
            for(int j = 0; j < 6; j++)
            {
                matriz[i][j] = s.nextInt();
            }

         }

         for(int i = 0; i<Qtd; i++)
         {
             for(int j = 0; j < 6; j++)
             {
                 for(int k = 0; k < 6; k++)
                 {
                   if(matriz[i][j] == matriz[Qtd][k])
                   {
                       Contador +=1;
                   }
                 }
             }

             if (Contador==4)
             {
               Quadra ++;
             }
             else if (Contador==5)
             {
               Quina ++;
             }
             else if (Contador==6)
             {
               Sena ++;
             }

             Contador = 0;
         }


         if(Sena > 0)
         System.out.println("Houve " + Sena + " acertador(es) da sena");

         else
         System.out.println("Nao houve acertador para sena");

         if(Quina > 0)
         System.out.println("Houve " + Quina + " acertador(es) da quina");

         else
         System.out.println("Nao houve acertador para quina");

         if(Quadra > 0)
         System.out.println("Houve " + Quadra + " acertador(es) da quadra");

         else
         System.out.println("Nao houve acertador para quadra");





    }
}