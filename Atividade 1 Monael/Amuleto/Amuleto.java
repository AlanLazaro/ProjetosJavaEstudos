import java.util.Scanner;

public class Amuleto
{
    public static void main(String[]args)
    {
        String N, N2;
        int Qtd, i, teste;

        Scanner s = new Scanner (System.in);
        while (s.hasNext())
        {
            N = s.next();
            N2 = "";
            teste = 0;
            if (N.equals("EOF") || N.equals("eof"))
            {
                break;
            }

            Qtd = N.length();

            for (int j = 0; j < Qtd; i++)
            {
                teste += 1;
                for (i=0; i < Qtd-1; i++)
                {
                    char ch1 = N.charAt(i);
                    N2 = N2 +ch1 + " ";
                }

                char ch1 = N.charAt(Qtd-1);
                N2 = N2 + ch1+"\n";

                if(Qtd > 1)
                {
                    for(int k =0; k< teste; k++)
                    {
                        N2 += " ";
                    }
                }
                Qtd = Qtd -1;
            }

            System.out.println(N2);


        }
    }
}