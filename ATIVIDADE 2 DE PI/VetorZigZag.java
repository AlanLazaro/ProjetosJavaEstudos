import java.util.Scanner;

class VetorZigZag
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        boolean T1 = true, T2=true, fim=false;
        int i, j, cont =0;
        int tam = s.nextInt();
        int Vetor[] = new int [tam];

        for (i=0; i < tam; i++)
        {
            Vetor[i] = s.nextInt();
        }
        for(i=2; i < tam; i++)
        {
           if(Vetor[i]> Vetor[i-1] && Vetor[i-1] > Vetor[i-2])
           {
               cont += 1;
           }
           else if(Vetor[i] < Vetor[i-1] && Vetor[i-1] < Vetor[i-2])
           {
               cont += 1;
           }
        }
        System.out.println(cont);
    }
}

