package main.java.alonso.dam.tema1.ejerciciosBasicos;

import java.util.Scanner;
public class Ejercicio5 {
	//Programa Java que lea tres números enteros por teclado y los muestre por pantalla de menor a mayor.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		
		if(n1<= n2 && n1 <= n3) {
			System.out.print(n1);
		if(n2 <= n3) {
			System.out.print(n2);
			System.out.print(n3);
		}else{
			System.out.print(n3);
			System.out.print(n2);
		}
		}else if (n2 <= n3 && n2 <=n1 ) {
			System.out.print(n2);
			if (n1<=n3) {
				System.out.print(n1);
				System.out.print(n3);
			}else {
				System.out.print(n3);
				System.out.print(n1);
		}
		}else {
			System.out.print(n3);
			if(n1 <=n2) {
				System.out.print(n1);
				System.out.print(n2);
			}else {
				System.out.print(n2);
				System.out.print(n1);
			}		
		}
		sc.close();
	}
		}
