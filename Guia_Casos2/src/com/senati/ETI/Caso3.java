package com.senati.ETI;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese numero 1: ");
int n1 = sc.nextInt();
		System.out.print("ingrese numero 2: ");
int n2 = sc.nextInt();
String mensaje = "";

//Condicional anidada.
if (n1==n2)
	mensaje = "los dos numeros son iguales";
else if (n1>n2)
	mensaje = "el primer numero es mayor";
else
	mensaje = "el segundo numero es mayor";
System.out.println("/nResultados");
System.out.println("---------------");
System.out.println("resultado........: " + mensaje);
		
		

	}

}
