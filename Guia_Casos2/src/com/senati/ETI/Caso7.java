package com.senati.ETI;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = sueldo * 3 / 100;
		else 
			if (sueldo <=3000)
				impuesto = sueldo * 8 / 100;
			else
			    impuesto = sueldo * 12 / 100;
		
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Impuesto calculado....: " + impuesto);
		


		
	}

}
