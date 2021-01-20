import java.util.Scanner;

class Huaauhahhuahau
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String risada = s.next();
        int tam = risada.length();
        int i=0, j =0, cont =0;
        for(i =0; i < tam; i++)
        {
            char c1 = risada.charAt(i);
            String c2 = "" + c1;
            if (c2.equals("a") ||c2.equals("e") || c2.equals("i") || c2.equals("o") || c2.equals("u") )
            {
                cont += 1;
            }
        }
        String Vetor[] = new String [cont];
        for(i =0; i < tam; i++)
        {
            char c1 = risada.charAt(i);
            String c2 = "" + c1;

            if (c2.equals("a") ||c2.equals("e") || c2.equals("i") || c2.equals("o") || c2.equals("u") )
            {
                Vetor[j] = c2;
                j += 1;
            }
        }

        boolean palindromo = true;

        for(i =0; i < cont && palindromo; i++)
        {
            boolean comp = Vetor[i].equals(Vetor[cont -1 - i]);
            palindromo &= comp;

        }
        if(cont == 0)
        {
            palindromo = false;
        }

        System.out.printf("%s%n", palindromo ? "S" : "N");

    }
}