import java.util.Scanner;

public class BuclesII {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int intentos = 10;
		int numeroAleatorio = (int)(Math.random()*100);
		int numeroUsuario = -1;
		while(numeroAleatorio!=numeroUsuario && intentos>0) {
			
			System.out.println("Dime un numero");
			numeroUsuario = in.nextInt();
			
			if(numeroAleatorio!=numeroUsuario) {
				
				intentos--;
				if(numeroAleatorio<numeroUsuario) {
					System.out.println("El número es más bajo");
				}

				else {
					System.out.println("El número es más alto");
				}

				System.out.println("Te quedan " + intentos + " intentos.");
				
			}else {
				
				System.out.println("Has acertado el número!! en " + intentos + " intentos.");
			}
			
		}
		
		in.close();
	}
}
