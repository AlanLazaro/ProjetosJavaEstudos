import java.util.Scanner;

public class Spirit
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int qtd, vezes, i, C1, C2, C3, Soma=0, j =0;
        String Palavra;
        
        Palavra = s.next();
        qtd = Palavra.length();
        vezes = qtd /3;
        
        for (i =0; i < vezes; i++)
        {
            
            C1 = (Palavra.charAt(j) == 'S')   ? 0 : 1;
            C2 = (Palavra.charAt(j+1) == 'O') ? 0 : 1;
            C3 = (Palavra.charAt(j+2) == 'S') ? 0 : 1;
            Soma += C1 + C2 + C3;   
            j += 3;
               
        }
        
        System.out.println(Soma);
    }
}