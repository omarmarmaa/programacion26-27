package ejericicios;

import java.util.Scanner;

public class SemanaCadena {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String dia= sc.next();
        String resultado;
        resultado = switch(dia) {
            case "Lunes"->"Es laboral";
            case "Martes"->"Es laboral";
            case "Miercoles"->"Es laboral";
            case "Jueves"->"Es laboral";
            case "Viernes"->"Es laboral";
            case "Sabado"->"Es Festivo";
            case "Domingo"->"Es Festivo";
            default-> {
                System.out.println("procesando");
                yield "Dia no valido";
            }
        };
        System.out.println(resultado);
        sc.close();
    }

}

