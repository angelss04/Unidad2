package Num_4;
import java.util.Scanner;


/**
*ENTRADA
*Numero a determinar si termina en 4
*SALIDA
*Si el numero termina en 4 o no
*
*PROCESO 
*Solicitar un número
*Leer num
*Si num % 10 == 4
*	Número si termina en 4
*SiNo
*	Numero no termina en 4
*
*CASOS PRUEBA
*		ENTRADA							SALIDA
*		19032						No termmina en 4
*		154							Si termmina en 4
*		109214						Si termmina en 4
*		18							No termmina en 4
*		4							Si termmina en 4
 * @author (AYSR) 
 * @version (24/02/2026)
 */
public class CNum_4
{
    public static void main (String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa que determina si el número que ingresaste termina en 4 \n");
        System.out.println("Ingresa un número: ");
        int num = leer.nextInt();
        if(num % 10 == 4)
        {
            System.out.println("El número " + num + " si termina en 4");
        }
        else
        {
            System.out.println("El número " + num + " no termina en 4");
        }
    }
}