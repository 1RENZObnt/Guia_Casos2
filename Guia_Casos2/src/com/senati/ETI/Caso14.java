package com.senati.ETI;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre de alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Carrera [DS - RC - DG] : ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno [M - T - N] : ");
		String turno = sc.nextLine();
		
		String nombre_carrera = "", nombre_turno = "";
		int valor = 0;
		float dscto = 0, total_sol = 0, total_dol = 0;
		
		switch (carrera) {
        case "DS":
        	nombre_carrera = "Desarrollo de software";
        	valor = 1500;
    	    break;
    	case "RC":
    	    nombre_carrera = "Redes y Conectividad";
    	    valor = 1400;
    	    break;
    	case "DG":
    	    nombre_carrera = "Diseño Grafico";
    	    valor = 1300;
    	    break;
    	default:
    		valor = 0;   	
		}
		
		switch (turno) {
        case "M":
        	nombre_turno = "Mañana";
        	dscto = 0.1f * valor;
    	    break;
    	case "T":
    	    nombre_turno = "Tarde";
    	    dscto = 0.2f * valor;
    	    break;
    	case "N":
    	    nombre_turno = "Noche";
    	    dscto = 0.15f * valor;
    	    break;
    	default:
    		dscto = 0;   	
		}

		total_sol = valor - dscto;
		total_dol = total_sol / 3.33f;
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Alumno.............: " + alumno);
		System.out.println("Carrera............: " + nombre_carrera);
		System.out.println("Turno..............: " + nombre_turno);
		System.out.println("Monto..............: " + "S/" + valor);
		System.out.println("Descuento..........: " + "S/" + dscto);
		System.out.println("Total en soles.....: " + "S/" + total_sol);
		System.out.println("Total en dolares...: " + "$" + df.format(total_dol));
		
	}

}
