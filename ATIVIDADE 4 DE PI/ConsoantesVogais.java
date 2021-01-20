import java.util.Scanner;

class ConsoantesVogais
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);
        
        String l = s.next().toUpperCase();
        if(l.equals("A")||l.equals("E")||l.equals("I")||l.equals("O")||l.equals("U"))
        System.out.println("vogal");
        
        else
        System.out.println("consoante");
        
    }
}