import java.io.IOException;
import java.util.Scanner;

public class Atividade3 {
	
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner(System.in);
        
         int nota = leitor.nextInt();
         
         if (nota < 1  ) System.out.println("E");
         else if (nota < 36) System.out.println("D");
         else if (nota < 61) System.out.println("C");
         else if (nota < 86) System.out.println("B");
         else if (nota <= 100 ) System.out.println("A");
         else System.out.println("Out of range");

    }
}