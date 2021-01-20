import java.util.Scanner;

class DataToStr
{
    public static void main(String[]args)
    {

        Scanner s = new Scanner(System.in);
        int Dia=0;
        int Mes=0;
        int Ano=0;

        while(s.hasNext())
        {

            String Vetor [] = new String [12];
            Vetor[0] = "Janeiro";
            Vetor[1] = "Fevereiro";
            Vetor[2] = "Marco";
            Vetor[3] = "Abril";
            Vetor[4] = "Maio";
            Vetor[5] = "Junho";
            Vetor[6] = "Julho";
            Vetor[7] = "Agosto";
            Vetor[8] = "Stembro";
            Vetor[9] = "Outubro";
            Vetor[10] = "Novembro";
            Vetor[11] = "Dezembro";
            
            Dia = s.nextInt();
            Mes = s.nextInt();
            Ano = s.nextInt();
            
        
            System.out.println(Dia+" de "+Vetor[Mes-1]+" de "+Ano);
            
        }
    }
}