package main.java.alonso.dam.tema1.ejerciciosBasicos;
import java.util.Scanner;

public class Ejercicio7 {

	//Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce el numero en km/h para pasarlo a m/s");
		double valor= sc.nextDouble();
        
		System.out.print(valor +" km/h "+ " es " +valor/3.6 +" m/s " );
		
		sc.close();
	}

}
