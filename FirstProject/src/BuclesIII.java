import java.util.Scanner;

public class BuclesIII {
		
	public static void main(String [] args) {
		String genero="";
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Introduce tu genero (H/M)");
			genero = in.nextLine();
		
		}while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		
		int altura = in.nextInt();
		
		if(genero.equals("H")) {
			System.out.println("Tu peso ideal es " + (altura-110) + " kg.");
		}else {
			System.out.println("Tu peso ideal es " + (altura-120) + " kg.");
		}
		
		in.close();
	}
}
