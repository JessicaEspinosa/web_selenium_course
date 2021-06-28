package ejerciciosTarea;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

	}
	
	public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
		
		double aux1 = num1*1000;
		double aux2= num2*1000;
		
		int auxInt = (int) aux1;
		int auxInt2 = (int)aux2;
		
		if(auxInt==auxInt2)
			return true;
		else
		    return false;
	}

}
