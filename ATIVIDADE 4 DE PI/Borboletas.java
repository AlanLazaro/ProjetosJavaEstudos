import java.util.Scanner;

class Borboletas
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int Qtd = s.nextInt();
        int matriz[][] = new int [Qtd][Qtd];
        int vetor[] = new int [2*Qtd];
        int Contador = 1;
        boolean Xesque = true;
        
        for(int i = 0; i < Qtd; i++)
         {
            for(int j = 0; j < Qtd; j++)
            {
                matriz[i][j] = s.nextInt();
            }

         }
         
         for(int i = 0; i < Qtd*2; i++)
         {
             int a = s.nextInt();
             int b = s.nextInt();
             
             vetor[i] = matriz[a-1][b-1];
         }
         
         for(int i = 0; i < (Qtd*2)-1; i++)
         {
            for(int j = i+1; j < Qtd*2; j++)
            {
                if(vetor[i] == vetor[j])
                Xesque = false;
            }
            if(Xesque == true)
            Contador ++;
            
            Xesque = true;

         }
         
         System.out.println(Contador);
         
    }
}