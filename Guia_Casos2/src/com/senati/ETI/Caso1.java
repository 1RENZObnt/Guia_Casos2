package com.senati.ETI;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese edad: ");
		int edad = sc.nextInt();
		String estado = "Menor de edad;";
		
		//condicional simple
		
		if (edad >= 18)
			estado = "Mayor de edad";
		System.out.println("/nResultados");
		System.out.println("--------------");
		System.out.println("Estado...........:" + estado);
		
		

	}

}
