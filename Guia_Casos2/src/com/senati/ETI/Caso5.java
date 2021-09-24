package com.senati.ETI;
 import java.util.Scanner;
public class Caso5 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float total = cantidad * precio;
		float descuento = 0;
		
		if (cantidad > 8 )
			descuento = 0.1f * total;
		else 
			descuento = 0;
		
		float neto = total - descuento;
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Importe parcial....: " + total);
		System.out.println("Descuento..........: " + descuento);
		System.out.println("Importe neto.......: " + neto);

	
	



	

	}

}
