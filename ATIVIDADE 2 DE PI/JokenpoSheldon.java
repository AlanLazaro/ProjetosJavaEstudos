import java.util.Scanner;

class JokenpoSheldon
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);

        int C = s.nextInt();
        boolean T1, T2, T3, T4, T5, T6, T7, T8, T9, T10;
        for(int i = 0; i < C; i++)
        {
            String Jogador1 = s.next();
            String Jogador2 = s.next();

            T1 = Jogador1.equals("pedra");
            T2 = Jogador1.equals("tesoura");
            T3 = Jogador1.equals("papel");
            T4 = Jogador1.equals("lagarto");
            T5 = Jogador1.equals("spok");
            T6 = Jogador2.equals("pedra");
            T7 = Jogador2.equals("tesoura");
            T8 = Jogador2.equals("papel");
            T9 = Jogador2.equals("lagarto");
            T10 = Jogador2.equals("spok");

            if (T1 && T7== true || T1== true && T9== true || T2== true && T8== true || T2== true && T9== true || T3== true && T6== true || T3== true && T10== true || T4== true && T10== true || T4== true && T8== true || T5== true && T6== true || T5== true && T7== true)
            {
                System.out.println("rajesh");
            }
            else if (T1== true && T6== true || T2== true && T7== true || T3== true && T8== true || T4== true && T9== true || T5== true && T10== true)
            {
                System.out.println("empate");
            }
            else
            {
                System.out.println("Sheldon");
            }
        }
    }
}