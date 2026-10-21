package alonso.dam.tema2.ejerciciosBasicos;
import java.util.Scanner;
public class Ejercicio1 {
//Programa Java que lea un número entero y calcule si es par o impar.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		boolean esPar;
		do {
			System.out.println("introduce un numero");
			numero=sc.nextInt();
			if(numero%2==0) {
				esPar=true;
				System.out.println("es par");
			}else {
				esPar=false;
				System.out.println("es impar");
			}
		}while(!esPar);
		
	}

}
