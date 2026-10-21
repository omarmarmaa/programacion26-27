package alonso.dam.tema2.ejerciciosBasicos;

import java.util.Scanner;

public class Ejerccio2 {
//2.    Calcular el mayor de tres números enteros en Java.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
 
		if(a>b && a>c) {
			if(b>c) {
				System.out.print(a + b + c);
			}else
				System.out.print(a + c + b);

		if(b>a && b>c) {
			if(a>c) {
				System.out.print(b + a + c);
			}else 
				System.out.print(b + c + a);
			
		if(c>a && c>b) {
			 if(a>b) {
				 System.out.print(c + a + b);
			 }else {
				 System.out.print(c + b + a);
			 }
		}
		 }
		}
		sc.close();
	}
}
