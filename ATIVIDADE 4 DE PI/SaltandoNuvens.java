import java.util.Scanner;

class SaltandoNuvens
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int Qtd = s.nextInt();

        int Vetor[]= new int [Qtd];
        boolean Teste=false;
        int Contador=0;
        
        for(int i =0; i < Qtd; i++)
        {
            Vetor[i] = s.nextInt();
        }
        
        for(int i = 0; i < Qtd; i++)
        {
            if(i < Qtd-2)
            {
                if(Vetor[i+2] == 0)
                {
                    i++;
                    Contador++;
                }
                
                else
                {
                    Contador++;
                }
            }
            
            else if(i == Qtd-2)
            {
                Contador++;
            }
         
        }
        
        System.out.println(Contador);
    }
}