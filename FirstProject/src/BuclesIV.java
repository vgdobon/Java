import java.util.Scanner;

public class BuclesIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		boolean arroba = false;
		int arrobas=0;
		boolean punto = false;
		
		System.out.println("Introduce tu email");
		String email = in.nextLine();
		for(int i=0; i< email.length();i++) {
			if(email.charAt(i)=='@') {
				
				arroba = true;
				arrobas++;
			}
			
			if(i==email.length()-3 || i==email.length()-4) {
				
				if(email.charAt(i)=='.') {
					punto=true;
				}
			}
		}
		
		if(arroba && punto && arrobas<2) {
			
			System.out.println("Email correcto");
			
		} else {
			
			System.out.println("Email incorrecto");
			
		}
		
		in.close();
		
	}

}
