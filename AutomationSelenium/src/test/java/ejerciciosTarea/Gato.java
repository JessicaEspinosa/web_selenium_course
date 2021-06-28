package ejerciciosTarea;

public class Gato {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(isCatPlaying(true,10));
		 System.out.println(isCatPlaying(false,36));
		 System.out.println(isCatPlaying(false,35));

	}
	
	
	
	
	public static boolean isCatPlaying(boolean verano, int temperatura) {
		
		if(verano == true){
			if(temperatura >=45)
				return true;
			else
				return false;
		}else {
			if(temperatura>=25 && temperatura<=35)
				return true;
		}
		
		return false;
	}
}
