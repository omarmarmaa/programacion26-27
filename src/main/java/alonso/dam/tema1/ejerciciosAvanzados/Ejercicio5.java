package main.java.alonso.dam.tema1.ejerciciosAvanzados;
import java.util.Scanner;
/*
 * Lee dos caracteres por teclado y muestra si son iguales. Introduce un solo carácter en cada lectura.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char caracter1=sc.next().charAt(0);
		char caracter2=sc.next().charAt(0);
		System.out.println(caracter1==caracter2?"son iguales": "no son iguales");
		sc.close();

	}

}
