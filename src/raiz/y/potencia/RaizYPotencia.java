// My love is my radio QuQ
package raiz.y.potencia;
// libreria con la que se va a usar el escaner de digitos
import java.util.Scanner;
public class RaizYPotencia{
public static void main(String args []){
    // Imprecion que solicita datos
    System.out.println("Ingresar Numero: "); 
    // Escaner 
    Scanner in = new Scanner (System.in);
    // Declaracion de variables tipo entero y double 
    double num=0, raiz=0, potencia=0, opcion=0 ;
    int numUno= 0; 
    // Se guardan los datos escaneados con este metodo
    num = in.nextDouble();
    
    // calculo de la raiz cuadrada
    raiz= Math.sqrt(num) ;
     // Calculo de potencia 
     potencia = num*num ;
 
    if (num >0)
    {
    // Imprecion que solicita un dato para ejecutar una accion 
    System.out.println("Opcion: ");
    // Se guardan los datos y ademas son escaneados con este metodo
    numUno = in.nextInt();
    // En caso de valer 1 la opcion se calcula la raiz cuadrada
    if (numUno == 1){System.out.println(raiz);}
    // En caso de valer otro valor que no sea 1, se calcula la potencia cuadrada de dicho numero
    else{System.out.println(potencia);}
    }
    // Si el numero solicitado es negativo, se le pedira al usuario un valor valido y finaliza el programa
    else {System.out.println("Ingresa un valor positivo ");}
 }
 
}