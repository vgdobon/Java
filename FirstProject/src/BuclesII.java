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
					System.out.println("El n�mero es m�s bajo");
				}

				else {
					System.out.println("El n�mero es m�s alto");
				}

				System.out.println("Te quedan " + intentos + " intentos.");
				
			}else {
				
				System.out.println("Has acertado el n�mero!! en " + intentos + " intentos.");
			}
			
		}
		
		in.close();
	}
}
