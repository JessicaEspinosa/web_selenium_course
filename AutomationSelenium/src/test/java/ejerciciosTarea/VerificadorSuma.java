package ejerciciosTarea;

public class VerificadorSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
	}
	
	public static boolean hasEqualSum(int num1, int num2, int result) {
		int suma = num1 +num2;
		if( (num1+num2) == result)
			return true;
		else
		 return false;
	}

}
