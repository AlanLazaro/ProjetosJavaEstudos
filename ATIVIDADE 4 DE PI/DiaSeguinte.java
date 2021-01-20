import java.util.Scanner;

class DiaSeguinte
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);
        int Dia = s.nextInt();
        int Mes = s.nextInt();
        int Ano = s.nextInt();
        
        boolean Bi;
        
        if ((Ano%400==0) ||((Ano%4==0) && (Ano%100!=0)))
        {
             Bi = true;
        } 
        else
        {
            Bi = false;
        }
        
        if(Dia > 30)
        {
            Mes +=1;
            Dia = 1;
            if(Mes == 13 )
            {
                Ano +=1;
                Mes =1;
            }
        }
        
        else if (Dia == 30)
        {
            if(Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11)
            {
                Dia = 1;
                Mes += 1;
            }
        }
        
        else if(Bi == true && Mes == 2 && Dia == 29)
        {
            Mes +=1;
            Dia = 1;
        }
        
        else if(Bi == false && Mes == 2 && Dia == 28)
        {
            Mes +=1;
            Dia = 1;
        }
        
        else
        {
            Dia +=1;
        }
        
        System.out.println(Dia + " " + Mes + " " + Ano);
    
    }
}