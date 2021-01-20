import java.util.Scanner;

class DiaAnterior
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
        
    
        if(Dia == 1)
        {
            Mes = Mes -1;
            
            if(Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 0)
            {
                Dia = 31;
                
                if(Mes == 0)
                {
                    Ano = Ano-1;
                    Mes = 12;
                }
            }
            
            if(Mes == 4 ||Mes == 6 ||Mes == 9 || Mes == 11)
            Dia = 30;
            
            if(Mes == 2)
            {
                if(Bi)
                Dia = 29;
                
                else
                Dia = 28;
            }

        }
        
        else
        Dia -= 1;
        
        System.out.println(Dia + " " + Mes + " " + Ano);
        
    }
}