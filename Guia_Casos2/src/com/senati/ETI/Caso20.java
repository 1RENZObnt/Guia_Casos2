package com.senati.ETI;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso20 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.00");

System.out.print("precio de venta: ");
int venta=sc.nextInt();
float ct = venta + venta * 42 / 100;

System.out.println("/nResultados");
System.out.println("--------------------");
System.out.println("Costo total.............."+df.format(ct));



	}

}
