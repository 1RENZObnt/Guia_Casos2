package com.senati.ETI;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer numero.............: ");
		float n1 = sc.nextFloat();
		System.out.print("Segundo numero............: ");
		float n2 = sc.nextFloat();
		System.out.print("0peracion [ 1 - 6 ].......: ");
		int operacion = sc.nextInt();
		
		String nom_op="";
		float resultado = 0;
		
		switch (operacion) {
		case 1:
			nom_op = "Suma";
			resultado = n1 + n2;
			break;
		case 2:
			nom_op = "Resta";
			resultado = n1 - n2;
			break;
		case 3:
			nom_op = "Multiplicacion";
			resultado = n1 * n2;
			break;
		case 4:
			if (n2 != 0)
				nom_op = "Division";
			    resultado = n1 / n2;
			    break;
		case 5:
			if ( n2 != 0)
				nom_op = "Resto entero";
				resultado = n1 % n2;
				break;
		case 6:
			nom_op = "Promedio";
			resultado = (n1 + n2) / 2;
			break;
		default:
			nom_op = "Operacion desconocida";
			resultado = 0;		
		}
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("numero1................: " + n1);
		System.out.println("numero2................: " + n2);
		System.out.println("Operacion..............: " + nom_op);
		System.out.println("Resultado..............: " +resultado);
		
		

	}

}
