import java.util.Scanner;

class RomaToIndu
{
    public static void main(String[]args)
    {
        int i, Qtd, Soma;
        Scanner s = new Scanner(System.in);

        String NumeroR;
        int Vetor[] = new int [20];
        int Total = 0;

        while (s.hasNext())
        {
            NumeroR = s.next();
            Qtd = NumeroR.length();

            for(i = 0; i < Qtd; i++)
            {
                int I = (NumeroR.charAt(i) == 'I') ? 1 : 0;
                int V = (NumeroR.charAt(i) == 'V') ? 5 : 0;
                int X = (NumeroR.charAt(i) == 'X') ? 10 : 0;
                int L = (NumeroR.charAt(i) == 'L') ? 50 : 0;
                int C = (NumeroR.charAt(i) == 'C') ? 100 : 0;
                int D = (NumeroR.charAt(i) == 'D') ? 500 : 0;
                int M = (NumeroR.charAt(i) == 'M') ? 1000 : 0;
                Soma = I + V + X + L + C + D + M;
                Vetor[i] = Soma;
            }

            for(i=0; i< Qtd; i++)
            {
                if (i< Qtd-1)
                {
                    if (Vetor[i] >= Vetor[i+1])
                    {
                        Total += Vetor[i];
                    }
                    else
                    {
                        Total -= Vetor[i];
                    }
                }

                else
                {
                    Total += Vetor[i];
                }
            }

            System.out.println(Total);
            Soma = 0;
            Total = 0;

        }

        System.out.println("");

    }
}