import java.util.Scanner;

class VetorX3
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int tam = s.nextInt();

        int Vetor[] = new int [tam];
        int Vetor2[] = new int [tam];
        
        for(int i = 0; i < tam; i++)
        {
           Vetor[i] = s.nextInt();
           if (i < tam-1)
           {
               System.out.print(Vetor[i]*3 + " ");
           }
           else
           {
               System.out.println(Vetor[i]*3);
           }
        }
    }
}