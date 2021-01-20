import java.util.Scanner;

class Pisos
{
    public static void main(String[]args)
    {
        
        Scanner s = new Scanner(System.in);
        
        int l = s.nextInt();
        int h = s.nextInt();
        int Quad, Tri;
        
        Quad = (l*h) + ((l-1)*(h-1));
        Tri = ((l - 1) * 2) + ((h - 1) * 2);
        
        System.out.println(Quad);
        System.out.println(Tri);
        
        
    }
}