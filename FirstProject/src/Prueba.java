import java.util.*;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner miScanner = new Scanner(System.in);
		
		System.out.println("�Cu�l es tu nombre?");
		String nombre = miScanner.nextLine();
		
		System.out.println(nombre);

		String nombreCompleto = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombreCompleto + ". Tienes "+ edad + " a�os.") ;
	
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
		
		System.out.printf("%1.2f" , Math.sqrt(numero));
		
		miScanner.close();
		
		
		
	}

}