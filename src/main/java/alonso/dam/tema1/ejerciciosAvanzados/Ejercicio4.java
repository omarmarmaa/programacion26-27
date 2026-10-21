package main.java.alonso.dam.tema1.ejerciciosAvanzados;
import java.util.Scanner;
public class Ejercicio4 {
/*
 * Lee un número entero y comprueba si es múltiplo de 7. 
 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numero=sc.nextInt();
	System.out.println(numero%7==0 ? "esMultiplo":"noEsMultiplo");
	sc.close();

	}

}
