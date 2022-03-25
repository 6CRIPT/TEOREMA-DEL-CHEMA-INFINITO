import java.util.Scanner;
import java.util.Locale;
public class monoxd
//AUTOR: DON 6CRIPT 2021
{
    public static void main (String [] args) {
        System.out.println("Introduzca una palabra");
        System.out.println("Si tiene mas de 4 caracteres es probable que no la encuentre XD que esperas este pc no es de la nasa lol");
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        String p = teclado.nextLine (); 
        int x =  p.length();
        int n = 0;
        int contador = 1;
        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        char[] pal = new char[x];
        boolean gg = false;
        
            while( gg == false ){
                while (n < x) {
                    int i = (int) (Math.random() * abc.length) ;
                    pal [n] = abc[i];
                    n++;
                }
                 n = 0;
                String a1 = "";
                    while(n < x ) {
                        
                        char a = pal[n];
                         a1 = a1 + a; 
                         n++;
                    }
                    if (p.equals(a1)) {gg = true; System.out.println(a1);  System.out.println( "NUMERO DE ITERACIONES:" + " " + (contador) + " "+ "PALABRA:" + " " + a1);} 
                    else { System.out.println(a1);}
                n = 0;
                contador++;
                
            }
    }
}
