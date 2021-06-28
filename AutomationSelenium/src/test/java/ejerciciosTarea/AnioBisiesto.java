package ejerciciosTarea;

public class AnioBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2016));
		
	}

	 public static boolean isLeapYear(int year) {
		 if(year >=1  && year <=9999) {
		   if ((year%4==0) || (year%100==0) || (year%400==0))
			   return true;
		 }else
		  return false;	
		 
		 return false;
	 }
	 
}
