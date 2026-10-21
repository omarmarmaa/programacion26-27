package main.java.alonso.dam.tema1.ejerciciosAvanzados;
import java.util.Scanner;
/* 
 * Pide una edad no negativa y muestra si la persona es mayor de edad. Considera que la mayoría de edad comienza a los 18 años. 
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int edad=sc.nextInt();
		if(edad<0) {
			System.out.println("edad no puede ser negativo");
		}else {
		System.out.println(edad>=18 ? "esMayorDeEdad": "esMenorDeEdad" );
		}
		sc.close();

	}

}
