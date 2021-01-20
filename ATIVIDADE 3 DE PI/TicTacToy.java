import java.util.Scanner;

class TicTacToy
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);        
        int jogos = s.nextInt();
        int l = 0;
        while(l < jogos)
        {

        String [][]  matriz = new String [3][3];
        boolean vitoriaO=true, vitoriaX=true, T1, vitoria = false;
      

            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    matriz[i][j] = s.next();
                    if(j == 2)
                    {
                        T1 = matriz[i][j].equals(matriz[i][j-1]);
                        T1 &= matriz[i][j-1].equals(matriz[i][j-2]);
                        if(T1)
                        {
                            vitoriaO = matriz[i][j].equals("O");
                            vitoriaX = matriz[i][j].equals("X");
                            vitoria = true;
                        }
                    }

                    if(i == 2)
                    {
                        T1 = matriz[i][j].equals(matriz[i-1][j]);
                        T1 &= matriz[i-1][j].equals(matriz[i-2][j]);
                        if(T1)
                        {
                            vitoriaO = matriz[i][j].equals("O");
                            vitoriaX = matriz[i][j].equals("X");
                            vitoria = true;
                        }
                    }

                }
            }

            if(matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2]))
            {
                vitoriaO = matriz[0][0].equals("O");
                vitoriaX = matriz[0][0].equals("X");
                vitoria = true;
            }
            
            if(matriz[2][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[0][2]))
            {
                vitoriaO = matriz[1][1].equals("O");
                vitoriaX = matriz[1][1].equals("X");
                vitoria = true;
            }

            if(vitoria)
            {
                if(vitoriaO)
                {
                    System.out.println("o jogador O venceu");
                }

                if(vitoriaX)
                {
                    System.out.println("o jogador X venceu");
                }
            }

            else
            {
            System.out.println("o jogo deu velha");
            }
            l++;
        }

    }
}