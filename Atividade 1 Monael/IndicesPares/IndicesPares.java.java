import java.util.Scanner;

class IndicesPares

{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int tam = s.nextInt();
        int Vetor[] = new int [tam];
        int a;
        
        if(tam %2==0)
        {
          a = tam/2;
        }
        else if(tam == 1)
        {
          a = 1;  
        }
        else
        {
          a = (tam/2)+1;
        }
        int Vetor2[] = new int [a];
        int Contador = 0, i, j=0;
        for(i=0; i < tam; i++)
        {
            Vetor[i] = s.nextInt();
            
            if( i % 2 == 0 && i != 1)
            {
              Vetor2[j] = Vetor[i];
              j+=1;
            }
            
            if(Vetor[i]%2==0)
            {
                Contador+=1;
            }
        }
        for(i=0; i<a; i++)
        {
            System.out.print(Vetor2[i] + " ");
        }
            System.out.println(Contador);      
    }
}