import java.util.Scanner;

class InverteMaxMin
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int tam = s.nextInt();
        int Vetor[] = new int [tam];
        int Contador = 0, i, j=0;
        int max=0, min=0, invert;
        int maxi=0, mini=0;

        for(i=0; i < tam; i++)
        {
            Vetor[i] = s.nextInt();
            if(i==0)
            {
                max = Vetor[i];
                min = Vetor[i];
            }
        }

        for (i=0; i <tam; i++)
        {
            if(Vetor[i] > max)
            {
                max = Vetor[i];
                maxi = i;
            }

            if(min > Vetor[i])
            {
                min = Vetor[i];
                mini = i;
            }
        }

        invert = Vetor[maxi];
        Vetor[maxi] = Vetor[mini];
        Vetor[mini] = invert;

        for(i=0; i<tam-1; i++)
        {
         System.out.print(Vetor[i]+" ");
        }
        System.out.println(Vetor[tam-1]);
    }
}