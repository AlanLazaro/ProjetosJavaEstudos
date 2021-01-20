import java.util.Scanner;

class Cha
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);
        
        int l = s.nextInt();
        int cont =0;

        for(int i = 0; i < 5; i++)
        {
          int seila = s.nextInt();
          if(seila == l)
          cont += 1;
        }
        
        System.out.println(cont);
        
        
    }
}