import java.util.Scanner;

class Consoantes
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String Letra = s.next().toUpperCase();
        int Cont2 =0, Cont=0;

        while(!Letra.equals("*"))
        {
            if(Letra.equals("A") || Letra.equals("E") || Letra.equals("I") || Letra.equals("O") || Letra.equals("U"))
            {
                Cont2 += 1;
            }

            Cont += 1;

            Letra = s.next().toUpperCase();
        }

         System.out.println(Cont - Cont2);
    }
}

