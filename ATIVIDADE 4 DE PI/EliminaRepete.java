import java.util.Scanner;
import java.util.Arrays;

class EliminaRepete
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);
        
        int Qtd = s.nextInt();
        int x = 0;
        boolean Teste = true;
        int Vetor[] = new int [Qtd];
        int Vetor2[] = new int [Qtd];
        
        for(int i=0; i <Qtd; i++)
        {
            Vetor[i] = s.nextInt();
        }
        
        for(int i =0; i<Qtd; i++)
        {
            Teste = false;
            for(int k = 0; k < x; k++)
            {
                if(Vetor[i] == Vetor2[k])
                {
                    Teste = true;
                    break;
                }
            }
            
            if(Teste == false)
            {
                Vetor2[x++] = Vetor[i];
            }
        }
        
        Vetor2 = Arrays.copyOf(Vetor2, x);
        
        for(int i=0; i < Vetor2.length; i++)
        {
            if(i < Vetor2.length-1)
            System.out.print(Vetor2[i]+" ");
            
            else
            System.out.println(Vetor2[i]);
        }
        
  
        
    }
}