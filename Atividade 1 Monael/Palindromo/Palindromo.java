import java.util.Scanner;

class Palindromo
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext())
        {
            String palavra = s.nextLine();
            
            int n = palavra.length();
            boolean palindromo = true;
            
            for(int i = 0; i<n && palindromo; i++)
            {
                boolean comp = palavra.charAt(i) == palavra.charAt(n - 1 - i);
                palavra.charAt(n - 1 - i);
                palindromo &= comp;
            }
            
            System.out.printf("%s%n", palindromo ? "sim" : "não");
        }
    }
}