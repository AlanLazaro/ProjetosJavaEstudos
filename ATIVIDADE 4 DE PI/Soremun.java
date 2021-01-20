import java.util.Scanner;

class Soremun
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);
        
        String valor = s.next();
        int tam = valor.length();
        char vetor[] = new char [tam];
        
        for(int i = 0; i < tam; i++)
        {
          vetor[i] = valor.charAt(i);  
        }
        
        for(int i = tam-1; i > -1; i--)
        {
            System.out.print(vetor[i]);
        }
        System.out.println("");
        
    }
}