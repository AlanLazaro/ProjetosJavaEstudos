import java.util.Scanner;

class AuaC
{
    public static void main(String[]args)
    {
         Scanner s = new Scanner(System.in);
         
        int Contador = 0;
        int N = s.nextInt();
        int K = s.nextInt();
         
         int Vetor[] = new int [N];
         
         for (int i = 0; i < N; i++)
         {
            Vetor[i] = s.nextInt();
            if(Vetor[i]<=0)
            {
                Contador += 1;
            }
         }
         if (Contador < K)
         {
             System.out.println("SIM");
         }
         else 
         {
             System.out.println("NAO");
         }
    }
}