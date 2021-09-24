package com.senati.ETI;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.print("ingrese el lado del traingulo: ");
		int base=sc.nextInt();
		
		float area=(base*3);
		System.out.println("/nResultados");
		System.out.println("----------------");
		System.out.println("area del triangulo......: "+df.format(area));
	
	}

}
