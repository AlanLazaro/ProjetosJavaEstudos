import java.util.Scanner;

class Carteiro
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int Casa = s.nextInt();
        int Pacote = s.nextInt();
        
        int posicao = 0;
        int passos = 0;
        int soma = 0, cont = 0;

        int []  VetorC = new int [Casa];
        int []  VetorP = new int [Pacote];

        for(int i = 0; i < Casa; i++)
        {
            VetorC[i] = s.nextInt();
        }
        
        for(int i = 0; i < Pacote; i++)
        {
            VetorP[i] = s.nextInt();
        }
        
        for(int i = 0; i < Pacote; i++)
        {

            for(int k = 0; k < Casa; k++)
            {
                if(VetorC[k] == VetorP[i])
                {
                    passos += Math.abs(posicao - k);
                    posicao = k;
                }
                
            }
        }
        
        System.out.println(passos);

    }
}