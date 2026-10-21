package main.java.alonso.dam.tema1.juego;
import java.util.Scanner;
import java.util.Random;
public class JuegoAleatorio {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		System.out.println("Escribe un numero del 1 al 10");
		int numero=sc.nextInt();
		int aleatorio = random.nextInt(10);
		
		while(numero!=aleatorio){
			System.out.println("incorrecto intenta de nuevo");
			numero=sc.nextInt();
			}
		System.out.println("correcto");	
		}
	}
