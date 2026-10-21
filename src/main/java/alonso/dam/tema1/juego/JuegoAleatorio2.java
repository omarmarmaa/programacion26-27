package main.java.alonso.dam.tema1.juego;

import java.util.Scanner;

public class JuegoAleatorio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero del 1 al 10");
		int numero=sc.nextInt();
		int aleatorio = (int)Math.random()*10+1;
		
		while(numero!=aleatorio){
			System.out.println("incorrecto intenta de nuevo");
			numero=sc.nextInt();
			}
		System.out.println("correcto");	
		}

	}

