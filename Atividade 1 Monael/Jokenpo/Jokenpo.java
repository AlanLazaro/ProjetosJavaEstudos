import java.util.Scanner;

class Jokenpo
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);
        
        int C = s.nextInt();
        boolean T1, T2, T3, T4, T5, T6;
        for(int i = 0; i < C; i++)
        {
            String Jogador1 = s.next();
            String Jogador2 = s.next();
            
            T1 = Jogador1.equals("pedra");
            T2 = Jogador1.equals("tesoura");
            T3 = Jogador1.equals("papel");
            T4 = Jogador2.equals("pedra");
            T5 = Jogador2.equals("tesoura");
            T6 = Jogador2.equals("papel");
            
            if (T1 == true && T4 == true || T2 == true && T5 == true || T3 == true && T6 == true)
            {
                System.out.println("empate");
            }
            else if (T1 == true && T5 == true || T2 == true && T6 == true || T3 == true && T4 == true)
            {
                System.out.println("jogador 1");
            }
            else
            {
                System.out.println("jogador 2");
            }
        }
    }
}