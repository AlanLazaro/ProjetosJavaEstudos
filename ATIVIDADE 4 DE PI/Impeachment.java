import java.util.Scanner;

class Impeachment
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext())
        {
            double Qtd = s.nextDouble(); 
            int Contador = 0;
             
             for(int i = 0; i < Qtd; i++)
             {
                int j = s.nextInt();
                int Teste = (j == 1) ? 1 : 0;
                Contador += Teste;

             }
             
             if(Qtd*2/3 <= Contador)
             System.out.println("impeachment");
             
             else
             System.out.println("acusacao arquivada");
             

         
        }
        
    }
}