import java.util.Scanner;

class AbaixoDiagonalPrincipal
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        String SM = s.next();
        int l = s.nextInt();
        double soma = 0, cont = 0;

        int [][]  matriz = new int [l][l];

        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                matriz[i][j] = s.nextInt();

            }
        }

        for(int i = 0; i < l; i++)
        {
            for(int j = i + 1; j < l ; j++)
            {
            soma += matriz[j][i];
            cont += 1;
            }
        }
        
        double media = soma/cont;
       
       if(SM.equals("S"))
       System.out.println(soma);
       
       if(SM.equals("M"))
       System.out.printf("%.1f\n" , media);
    }
}