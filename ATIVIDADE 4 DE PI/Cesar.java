import java.util.Scanner;

public class Cesar
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int cod = s.nextInt();
        

        char Letras[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char LetrasM[] ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String FraseCod = "";

        while(s.hasNext())
        {
            String txt = s.nextLine();
            int tam = txt.length();
            char Frase[] = new char[tam];
            char teste[] = new char[tam];
            for(int i=0;i<tam;i++)
            {
                teste[i] = txt.charAt(i);
                Frase[i] = txt.charAt(i);
            }
            for(int i=0; i<tam; i++)
            {
                for(int j=0; j<26; j++)
                {
                    if((j + cod) <= 25)
                    {
                        if(teste[i] == Letras[j])
                        {
                           Frase[i] = Letras[j + cod];
                        }
                        else if(teste[i] == LetrasM[j])
                        {
                            Frase[i] = LetrasM[j + cod];
                        }
                    }
                    else if((j + cod) > 25)
                    {
                        int c = (j + cod) - 26;

                        if(teste[i] == Letras[j] )
                        {
                            Frase[i] = Letras[c];
                        }
                        else if(teste[i] == LetrasM[j] )
                        {
                            Frase[i] = LetrasM[c];
                        }
                    }
                }
            }

            for(int i = 0; i<tam;i++)
            {
                FraseCod = FraseCod + Frase[i];
            }
            System.out.println(FraseCod);
        }
    }
}