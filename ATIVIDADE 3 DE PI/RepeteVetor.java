import java.util.Scanner;

class RepeteVetor
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int tipo = s.nextInt();
        int qtd = s.nextInt();
        int tamVetor = s.nextInt();
        int soma = 0, n = 0;
        boolean tipoT =  tipo == 1;
        
        int [] vetor = new int [tamVetor];
        
        for(int i = 0; i < tamVetor; i++)
        {
          vetor[i] = s.nextInt();  
        }
        
        if(tipoT == false)
        {
            int [][]  matriz = new int [qtd][tamVetor];
            
            for(int i = 0; i < qtd; i++)
            {
                for(int j = 0; j < tamVetor; j++)
                {
                    matriz[i][j] = vetor[j];
    
                }
            }
            
            for(int i = 0; i < qtd; i++)
            {
                for(int j = 0; j < tamVetor; j++)
                {
                    if(j != tamVetor -1 )
                    System.out.print(matriz[i][j]+" ");
                    
                    else
                    System.out.print(matriz[i][j]);
    
                }
                System.out.println("");
            }
                
        }
        
         
        else
        {
            int [][]  matriz = new int [tamVetor][qtd];
            
            for(int i = 0; i < tamVetor; i++)
            {
                for(int j = 0; j < qtd; j++)
                {
                    matriz[i][j] = vetor[i];
    
                }
            }
            
            for(int i = 0; i < tamVetor; i++)
            {
                for(int j = 0; j < qtd; j++)
                {
                    if( j != qtd - 1)
                    System.out.print(matriz[i][j]+" ");
                    else
                    System.out.print(matriz[i][j]);
    
                }
                
                System.out.println("");
            }
            
        }
        
    }
}