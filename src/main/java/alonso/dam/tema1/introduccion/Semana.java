package main.java.alonso.dam.tema1.introduccion;
import java.util.Scanner;

public class Semana {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el numero del dia de la semana");
		byte numero=sc.nextByte();
		
		switch(numero){
		case 1:
			System.out.println("hoy es Lunes");
			break;
		case 2:
			System.out.println("hoy es martes");
			break;
		case 3:
			System.out.println("hoy es miercoles");
			break;
		case 4:
			System.out.println("hoy es jueves");
			break;
			
		case 5:
			System.out.println("hoy es viernes");
			break;
		case 6:
			System.out.println("hoy es sabado");
			break;
		case 7:
			System.out.println("hoy es domingo");
			break;
			
			default: System.out.println("te has confundido");
		}
		

	}

}
