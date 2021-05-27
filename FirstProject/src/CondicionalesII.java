import java.util.Scanner;

public class CondicionalesII {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Elije una opcion: \n"
	                      +"1.Tri�ngulo \n"
	                      +"2.Cuadrado \n"
	                      +"3.Pent�gono \n"
	                      +"4.Circulo \n");
		
		int opcion= in.nextInt();
		double area = 0;
		
		switch(opcion) {
		case 1:
			
			System.out.println("Introduce la base del tri�ngulo");
			int base = in.nextInt();
			
			System.out.println("Introduce la altura del tri�ngulo");
			int altura = in.nextInt();
			
			area = (base*altura)/2;
			
			System.out.print("El �rea del triangulo es:");
			break;
			
		case 2:
			
			System.out.println("Introduce el lado del cuadrado");
			int lado = in.nextInt();
		
			area = Math.pow(lado,2);
			
			System.out.print("El �rea del cuadrado es:");
			break;
			
		case 3:
			System.out.println("Introduce el lado del pent�gono");
			double ladoPentagono = in.nextDouble();
			
			double apotema = (ladoPentagono/2)/Math.tan(Math.toRadians(36));
			
			area = (ladoPentagono*apotema*5/2);
			
			System.out.print("El �rea del pent�gono es:");
			
			break;
			
		case 4:
			
			System.out.println("Introduce el radio del c�rculo");
			double radio = in.nextDouble();
			
			area = Math.PI * radio;
			
			System.out.print("El �rea del c�rculo es:");
			
			break;
			
		default:
			
			System.out.println("No has introducido una opci�n correcta");
		}
		
		System.out.println(area);
		
		in.close();
		
	}
}
