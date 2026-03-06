package areaCirculo;
import java.util.Scanner;


/**
*Se requiere determinar el área de un círculo, a partir de su radio
*
*ENTRADA
*radio del circulo. 
*SALIDA
*area del circulo
*PROCESO 
*Solicitar el radio del circulo
*Leer radio
*area = pi * radio^2
*resultado = Redon(area * 100) / 100
*Escribir "La área del circulo es: ", resultado
*
*					CASOS PRUEBA
*		    ENTRADA							        SALIDA
*			5								78.54	
*			3								28.27
*			6								113.1
*			2								12.57
*			4								50.27
 * @author (AYSR) 
 * @version (a version number or a date)
 */
public class areaCirculoC
{
    public static void main (String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa que determina el área de un círculo, a partir de su radio \n");
        System.out.println("Ingresa el radio del círculo: ");
        int radio = leer.nextInt();
        double area = Math.PI * (radio * radio);
        double resultado = Math.round(area * 100.0) / 100.0;
        System.out.println("El área del círculo es: " + resultado);
    }
}