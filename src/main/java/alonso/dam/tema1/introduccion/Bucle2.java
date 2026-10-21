package main.java.alonso.dam.tema1.introduccion;
import java.util.Scanner;

public class Bucle2 {
	static void bucle(int n) {
		for(int i=1; i<=n; i++) {
		System.out.print(i+ ", ");
		}
	
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dame un numero");
		int num= scanner.nextInt();
		bucle(num);
		
		scanner.close();
	}
}
