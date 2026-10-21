package main.java.alonso.dam.tema1.ejerciciosAvanzados;
import java.util.Scanner;
/* 
 Lee un número entero y muestra si es par o impar. 
 */
public class Ejercicio1 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=sc.nextInt();
	System.out.println(numero%2==0 ? "esPar":"esImpar");
	sc.close();
	}

}
