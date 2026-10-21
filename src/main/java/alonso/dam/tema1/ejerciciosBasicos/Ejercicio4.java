package main.java.alonso.dam.tema1.ejerciciosBasicos;
import java.util.Scanner;
public class Ejercicio4 {
//Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número. 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=sc.nextInt();
		
	System.out.println("el doble de "+ numero + " es "+ numero*2);
	System.out.println("el triple de "+ numero + " es "+ numero*3);


	sc.close();
	}
}
