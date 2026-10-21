package main.java.alonso.dam.tema1.ejerciciosBasicos;

public class Ejercicio2 {
 /*
  * Programa Java que declare una variable "c" de tipo entero y asígnale un valor.
  *  A continuación, muestra un mensaje indicando si el valor de "c" es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
  *   Consideraremos el 0 como positivo.
  *  Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
  */
	public static void main(String[] args) {
		int c=30;
		System.out.println(c>=0? "esPositivo": "esNegativo");
		System.out.println(c%2==0? "esPar":"esImpar");
		System.out.println(c%5==0 ? "esMultiplo": "noEsMultiplo");
		System.out.println(c%10==0 ? "esMultiplo": "noEsMultiplo");
	}

}
