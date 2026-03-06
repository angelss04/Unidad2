package numAscendente;
import java.util.Scanner;


/**
*Leer tres números enteros y mostrarlos ascendentemente
*
*ENTRADA
*primer número
*segundo número
*tercer número
*SALIDA
*los numeros en orden ascendente
*PROCESO 
*Solicita el primer número
*Leer num1
*Solicita el segundo número
*Leer num2
*Solicita el tercer número
*Leer num3
*    Si num1 <> num2 y num1 <> num3 y num2 <> num3
*        Si num1 < num2 y num1 < num3
*            Si num2 < num3
*                Escribir num1 , num2, num3
*            SiNo
*                Escribir num1, num3, num2
*            FinSi
*        SiNo
*            Si num2 < num1 y num2 < num3
*                Si num1 < num3
*                    Escribir num2, num1, num3
*                SiNo 
*                    Escribir num2, num3, num1
*                FinSi
*            SiNo
*                Si num1 < num2 
*                    Escribir num3, num1, num2
*                SiNo
*                    Escribir num3, num2, num1
*                FinSi
*            FinSi
*        FinSi
*    SiNo
*        Escribir Los números deben ser diferentes.
*    FinSi
*
*                CASOS PRUEBA
*    ENTRADA                        SALIDA
*    8, 3, 5                        3, 5, 8
*    2, 4, 9                        2, 4, 9
*    10, 7, 1                            1, 7, 10
*    5, -2, -8                    -8, -2, 5
*    4, 4, 7                        Los números deben ser diferentes
 * @author (AYSR) 
 * @version (03/03/2026)
 */
public class numAscendenteC
{
    public static void main (String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa que lee tres números enteros y los muestra ascendentemente \n");
        System.out.println("Ingresa un Número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingresa un Número: ");
        int num2 = leer.nextInt();
        System.out.println("Ingresa un Número: ");
        int num3 = leer.nextInt();
        if(num1 != num2 && num1 != num3 && num2 != num3)
        {
            if(num1 < num2 && num1 < num3)
            {
                if(num2 < num3)
                {
                    System.out.println("\n" + num1 + "\n" + num2 + "\n" + num3);
                }
                else
                {
                    System.out.println("\n" + num1 + "\n" + num3 + "\n" + num2);
                }
            }
            else if (num2 < num1 && num2 < num3)
            {
                if(num1 < num3)
                {
                    System.out.println("\n" + num2 + "\n" + num1 + "\n" + num3);
                }
                else
                {
                    System.out.println("\n" + num2 + "\n" + num3 + "\n" + num1);
                }
            }
            else
            {
                if(num1 < num2)
                {
                    System.out.println("\n" + num3 + "\n" + num1 + "\n" + num2);
                }
                else
                {
                    System.out.println("\n" + num3 + "\n" + num2 + "\n" + num1);
                }
            }
        }
        else
        {
            System.out.println("Los números deben ser diferentes.");
        }
    }
}