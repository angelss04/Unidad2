package sumaDig;
import java.util.Scanner;


/**
*Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.
*ENTRADA
*número entero de tres digitos
*SALIDA
*suma de sus digitos
*PROCESO 
*Solicitar un numero entero de tres digitos
*Leer num
* Si abs(num) >= 100 y abs(num) <= 999
*	primerDigito = trunc(abs(num) / 100)
*	segundoDigito = trunc(abs(num) / 10) % 10
*	tercerDigito = abs(num) %10 
*	suma = primerDigito + segundoDigito + tercerDigito
*	 la suma de los digitos es, suma
*SiNo
*	El número no es de tres digitos
*FinSi
*
*				CASOS PRUEBA
*	      ENTRADA					              Salida
*		123							6
*		5421						no es de tres digitos
*		12						no es de tres digitos	
*		542							11
*		392							14
 * @author (AYSR) 
 * @version (25/02/2026)
 */
public class sumaDigC
{
    public static void main (String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número entero de tres digitos: ");
        int num = leer.nextInt();
        if(Math.abs(num) >= 100 && Math.abs(num) <= 999)
        {
            int primerDigito = Math.abs(num) / 100;
            int segundoDigito = (Math.abs(num) / 10) % 10;
            int tercerDigito = Math.abs(num) % 10;
            int suma = primerDigito + segundoDigito + tercerDigito;
            System.out.println("La suma de los dígitos: " + suma);
        }
        else
        {
            System.out.println("El número ingresado no es de 3 dígitos");
        }
    }
}