import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		String usuario = "Pedro";
		String pass = "1234";
		
		while(!usuario.equals(pass)) {
			
			System.out.println("Introduce una contrase�a");
			pass = in.nextLine();
			
			if(!usuario.equals(pass)) {
				
				System.out.println("Contrase�a incorrecta!");
			}
		}
		
		System.out.println("Contrase�a correcta!");
		in.close();

	}

}
