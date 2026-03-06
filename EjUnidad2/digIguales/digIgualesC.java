package digIguales;
import java.util.Scanner;


/**
*Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.
*
*ENTRADA
*número de dos digitos
*SALIDA
*si los digitos son iguales o no
*PROCESO 
*Solicitar un número de dos digitos
*Leer num
*Si abs(num) >= 10 y abs(num) <= 99
*primerDigito = num / 10
*segundoDigito = num % 10
*	Si primerDigito = segundoDigito
*	los dos digitos son iguales
*	SiNo 
*	los digitos no son iguales
*	FinSi
*SiNo
*El numero no es de 2 digitos
*FinSi

*				CASOS PRUEBA
*	  ENTRADA					SALIDA
*		33						  los digitos son iguales
*		23						  los digitos no son iguales
*		881						  el numero no es de 2 digitos
*		-11						  los digitos son iguales
*		-52						  los digitos no son iguales
 * @author (AYSR) 
 * @version (24/02/2026)
 */
public class digIgualesC
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa que lee un número entero de dos dígitos y determinar si los dos dígitos son iguales \n");
        System.out.println("Ingresa un número de dos dígitos");
        int num = leer.nextInt();
        if (Math.abs(num) >= 10 && Math.abs(num) <= 99)
        {
            double primerDigito = num / 10;
            double segundoDigito = num % 10;
            if (primerDigito == segundoDigito)
            {
                System.out.println("Los digitos de " + num + " son iguales"); 
            }
            else
            {
                System.out.println("Los digitos de " + num + " no son iguales");
            }
        }
        else
        {
            System.out.println("El número que ingresaste no es de dos dígitos");
        }
    }
}