package com.senati.ETI;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo..........: ");
		float sueldo = sc.nextFloat();
		
		float impuesto= 0;
		
		if (sueldo > 2800)
			impuesto = sueldo * 5 / 100;
		
		else
			impuesto = sueldo * 2 / 100;
		System.out.println("Impuesto calculado......: " + impuesto);
			

	}

}
