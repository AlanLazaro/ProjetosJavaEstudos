import java.util.Scanner;

class BackToTheFuture
{
    public static void main(String[]args)
    {

        Scanner s = new Scanner(System.in);
        int Qtd = s.nextInt();


        for(int Fon = 0; Fon < Qtd; Fon ++ )
        {

            int Dia = s.nextInt();
            int Mes = s.nextInt();
            int Ano = s.nextInt();
            int Tam = s.nextInt();
            int Teste = 0, Contador=0;
            boolean Bi=false;
            String cod = s.next();


            if ((Ano%400==0) ||((Ano%4==0) && (Ano%100!=0)))
            Bi = true;

            else
            Bi = false;


            for(int i = 0; i < Tam; i++ )
            {
                Teste = (cod.charAt(i) == '>') ? 1 : -1;
                Contador += Teste;
            }

            if(Contador > 0)
            {
                for(int i = 0; i < Contador; i++)
                {
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

                        else
                        Dia +=1;
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
                }
            }

            if(Contador < 0)
            {
                for(int i = Contador; i < 0; i++)
                {
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
                }
            }

            System.out.println(Dia+"/"+Mes+"/"+Ano);
        }

    }
}