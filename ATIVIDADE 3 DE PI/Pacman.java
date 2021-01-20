import java.util.Scanner;

class Pacman
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        int l = s.nextInt();
        int qtdPontos = 0, qtdMortes = 0, maxPontos=0;

        char [][]  matriz = new char [l][l];
        String [] vetor = new String[l];

        for(int i = 0; i < l; i++)
        {
                vetor[i] = s.next();
        }
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                matriz[i][j] = vetor[i].charAt(j);
            }
        }
        
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                if(matriz[i][j] == 'o')
                qtdPontos += 1;
                
                if(matriz[i][j] == 'A')
                {
                  if(qtdMortes==0)
                  maxPontos = qtdPontos;
                  
                  else if(qtdPontos > maxPontos)
                  maxPontos = qtdPontos;
                  
                  qtdPontos =0;
                  qtdMortes +=1;
                }
                
                else if(qtdPontos > maxPontos)
                  maxPontos = qtdPontos;
            }
            
            i ++;
            
            if(i >= l)
            {
                break;
            }
            
            for(int j = l-1; j > -1; j--)
            {
            
                if(matriz[i][j] == 'o')
                qtdPontos += 1;
                
                if(matriz[i][j] == 'A')
                {
                  if(qtdMortes==0)
                  maxPontos = qtdPontos;
                  
                  else if(qtdPontos > maxPontos)
                  maxPontos = qtdPontos;
                  
                  qtdPontos =0;
                  qtdMortes +=1;
                }
                
                else if(qtdPontos > maxPontos)
                  maxPontos = qtdPontos;
            }
        }
        
        System.out.println(maxPontos);

    }
}