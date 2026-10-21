package main.java.alonso.dam.tema1.introduccion;
import java.util.Scanner;
public class CondicionalEdad {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int edad= entrada.nextInt();
		
		if(edad<=5) {
			//Eres Mayor De Edad
			System.out.println("Eres un bebe");
		}else if(edad<18) {
			System.out.println("Eres menor de edad");
		}else if(edad<30) {
			System.out.println("Eres mayor de edad");
		}
		
		entrada.close();
		

	}

}
