import java.io.IOException;
import java.util.Scanner;

public class Atividade1 {
	
    public static void main(String[] args) throws IOException {
      
      Scanner s = new Scanner(System.in);
      
      int num = s.nextInt();
      
    	for (int i = 1 ; i <= num ; i++) {
    	  
    		if (i % 2 == 0 ) System.out.println(i);
    	}
    }
	
}