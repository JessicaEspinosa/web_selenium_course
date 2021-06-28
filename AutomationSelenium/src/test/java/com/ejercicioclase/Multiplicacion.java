package com.ejercicioclase;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 imprimirMultiplicacion(multiplicacionNumero(5, 5));

	}

	public static double multiplicacionNumero (int x, int y) {
	return x*y;	
	}
	
	public static void imprimirMultiplicacion(double x) {
		System.out.println("El resultado es: "+x);
	}
}
