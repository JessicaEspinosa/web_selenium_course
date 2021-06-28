package com.java;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While
		
		int numero = 1;
		while (numero<=10) {
			System.out.println(numero);
			numero++;
		}

		//Do While
		
		int numeroLimit = 20;
		int sum = 0;
		int count= 0;
		
		do {
			sum +=numeroLimit;
			count++;
		}while(sum <100);
		
		System.out.println(" contador " +count);
	}

}
