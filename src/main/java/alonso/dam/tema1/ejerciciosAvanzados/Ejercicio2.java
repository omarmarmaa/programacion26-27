package main.java.alonso.dam.tema1.ejerciciosAvanzados;
import java.util.Scanner;
/* 
 Lee un número entero y muestra si es múltiplo de 10. 
 */
public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int numero=sc.nextInt();
	 
	 System.out.println(numero%10==0 ? "esMultiplo" : "noEsMultiplo");
	sc.close(); 
	}

}
