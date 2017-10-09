
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       float euros,cambio,dolares;
       System.out.println("teclea euros:");
       euros=sc.nextFloat();
       System.out.println("teclea cambio:");
       cambio=sc.nextFloat();
       dolares= euros*cambio;
       System.out.println(euros + "euros son "+ dolares +"dolares");
       
    }
    
}
