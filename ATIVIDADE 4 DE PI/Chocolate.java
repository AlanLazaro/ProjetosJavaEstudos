
import java.util.Scanner;

class Chocolate
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int Qtd = s.nextInt();
        int soma = 0, cont = 0;

        int []  Vetor = new int [Qtd];

        for(int i = 0; i < Qtd; i++)
        {
            Vetor[i] = s.nextInt();
        }

        int dia = s.nextInt();
        int mes = s.nextInt();

        for(int j =0; j < Qtd-mes+1; j++)
            {
                for(int k =j; k < j+mes; k++)
                {
                    soma += Vetor[k];
                }

                if(soma==dia)
                {
                    cont +=1;
                }

                else if(mes==1)
                {
                    if(Vetor[j]==dia)
                    cont+=1;
                }
                
                soma =0;

            }
        if(Qtd==1 && mes!=1)
        {
            if(Vetor[0]==dia)
            cont+=1;
        }

        System.out.println(cont);


    }
}