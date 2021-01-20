import java.util.Scanner;

class Cedulas
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);
        
        int valor = s.nextInt();
        int matriz [] [] = new int [7][2];
        
        matriz[0][0] = valor / 100;
        matriz[0][1] = 100;
        
        matriz[1][0] = (valor % 100)/50 ;
        matriz[1][1] = 50;
        
        matriz[2][0] = ((valor%100)%50) / 20;
        matriz[2][1] = 20;
        
        matriz[3][0] = (((valor%100)%50)%20)/10;
        matriz[3][1] = 10;
        
        matriz[4][0] = ((((valor%100)%50)%20)%10)/5;
        matriz[4][1] = 5;
        
        matriz[5][0] = (((((valor%100)%50)%20)%10)%5)/2;
        matriz[5][1] = 2;
        
        matriz[6][0] = (((((valor%100)%50)%20)%10)%5)%2;
        matriz[6][1] = 1;
        
        System.out.println("R$" + valor + ".00");
        for(int i =0; i < 7; i++)
        {
            System.out.println(matriz[i][0] + " nota(s) de R$" + matriz[i][1] + ".00");
        }
        
    }
}