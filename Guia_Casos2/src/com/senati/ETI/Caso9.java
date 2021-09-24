package com.senati.ETI;
import java.util.Scanner;
public class Caso9 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1 [0-20]: ");
		float nota1 = sc.nextInt();
		System.out.print("Nota 2 [0-20]: ");
		float nota2 = sc.nextInt();
		System.out.print("asistencia [0-12]: ");
		float na = sc.nextInt();
		float promedio=(float)(nota1+0.3+nota2*0.7);
		float porcentaje=na/12*100;
		String estado = "Desaprobado";
		if (promedio>=13&&porcentaje >=70)
			estado="Aprobado";
		
		System.out.println("/nResultados");
		System.out.println("---------------------");
		System.out.println("Alumno.....................: "+nombre);
		System.out.println("Promedio.................: "+promedio);
		System.out.println("Asistencia.................: "+porcentaje+"%");
		System.out.println("Estado.......................: "+estado);
		
		
		
		
		
		

	}

}
