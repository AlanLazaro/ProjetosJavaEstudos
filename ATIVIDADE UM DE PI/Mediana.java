import java.util.Scanner;

class Mediana
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        int tam = s.nextInt();
        int Vetor[] = new int [tam];
        
        for(int i =0; i <tam; i++)
        {
            Vetor[i] = s.nextInt();
        }
        
        for(int i =0; i< tam; i++)
        {
            int min = i;
            for( int j = i +1; j<tam; j++)
            {
                if(Vetor[j] < Vetor[min])
                {
                    min = j;
                }
            }
            
            int Troca = Vetor[i];
            Vetor[i] = Vetor[min];
            Vetor[min] = Troca;
        }
        
        double mediana;
        if(tam % 2 == 0)
        {
            mediana = (double)(Vetor[ tam/2 ] + Vetor[ tam/2 - 1 ])/2;
        }
        else
        {
            mediana = Vetor[tam/2];
        }
        System.out.printf("%.2f%n", mediana);
    }
}