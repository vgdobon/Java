import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		String usuario = "Pedro";
		String pass = "1234";
		
		while(!usuario.equals(pass)) {
			
			System.out.println("Introduce una contraseņa");
			pass = in.nextLine();
			
			if(!usuario.equals(pass)) {
				
				System.out.println("Contraseņa incorrecta!");
			}
		}
		
		System.out.println("Contraseņa correcta!");
		in.close();

	}

}
