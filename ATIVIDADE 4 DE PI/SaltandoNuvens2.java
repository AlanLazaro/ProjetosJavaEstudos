import java.util.Scanner;

class SaltandoNuvens2
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int Qtd = s.nextInt();
        int pulo = s.nextInt();

        int Vetor[]= new int [Qtd];
        int Contador=100;

        for(int i =0; i < Qtd; i++)
        {
            Vetor[i] = s.nextInt();
        }

        for(int i = 0; i < Qtd; i++)
        {
            
            if(i < Qtd-pulo)
            {
                
                if(Vetor[i+pulo] == 1 )
                {
                    Contador -= 3;
                }

                else
                {
                    Contador--;
                }
                
                 i = i + pulo -1;
            }

            else if(i == Qtd-1)
            {
                Contador--;
            }

        }

        System.out.println(Contador);
    }
}