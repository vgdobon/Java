import java.util.Scanner;

public class BuclesV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero = in.nextInt();
		long resultado=1;
		
		for(int i = numero; i > 0; i--) {
			
			resultado = resultado * i;
		}
			
		System.out.println("El factorial de " + numero + " es " + resultado);
		in.close();
	}

}
