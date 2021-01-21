import java.util.Scanner;
public class Pangrama
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);

        while(s.hasNext())
        {
            String txt = s.nextLine();
            
            if(TestandoPan(txt.toLowerCase()))
            {
                System.out.println("sim");
            }
            else
            {
                System.out.println("nao");
            }
        }
    }

    private static boolean TestandoPan(String txt)
    {
        String Letras = "abcdefghijklmnopqrstuvwxyz";

        for(int j = 0; j < Letras.length(); j++)
        {
            if(!txt.contains(""+Letras.charAt(j)))
            {
                return false;
            }
        }
        return true;
    }
}