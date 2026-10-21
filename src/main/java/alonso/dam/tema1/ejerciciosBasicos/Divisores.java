package main.java.alonso.dam.tema1.ejerciciosBasicos;

import java.util.Scanner;

public class Divisores {
	static void divi(int n) {
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				System.out.print(i + " ");
			}
		}
	
	}

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int n=teclado.nextInt();
		divi(n);
		teclado.close();
	}
}
