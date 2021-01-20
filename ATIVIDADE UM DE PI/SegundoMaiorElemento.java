import java.util.Scanner;

class SegundoMaiorElemento
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int tam = s.nextInt();

        int Vetor[] = new int [tam];
        int Contador = 0,Cont2=0, i, indice=0;
        int max=0, max2=0, invert;

        for(i=0; i < tam; i++)
        {

            Vetor[i] = s.nextInt();
            
            if(i == 0)
            {
                max = Vetor[0];
                max2 = Vetor[0];
            }

            if(Vetor[i] > max)
            {
                max = Vetor[i];
            }
            
            if(max == Vetor[0])
            {
                max2 = Vetor[1];
                indice =1;
            }
        }
        for(i=0; i < tam; i++)
        {
            if(Vetor[i] > max2 && Vetor[i] < max)
            {
                max2 = Vetor[i];
                indice = i;

            }
            
            if(Vetor[i] == max)
            {
                Cont2 += 1;
                
                if(Cont2 == 2 )
                {
                    max2 = Vetor[i];
                    indice = i;
                    
                }
                
            }

            

        }
        System.out.print(indice + " ");
        System.out.println(max2);

    }
}