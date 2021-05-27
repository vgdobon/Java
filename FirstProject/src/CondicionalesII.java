import java.util.Scanner;

public class CondicionalesII {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Elije una opcion: \n"
	                      +"1.Triángulo \n"
	                      +"2.Cuadrado \n"
	                      +"3.Pentágono \n"
	                      +"4.Circulo \n");
		
		int opcion= in.nextInt();
		double area = 0;
		
		switch(opcion) {
		case 1:
			
			System.out.println("Introduce la base del triángulo");
			int base = in.nextInt();
			
			System.out.println("Introduce la altura del triángulo");
			int altura = in.nextInt();
			
			area = (base*altura)/2;
			
			System.out.print("El área del triangulo es:");
			break;
			
		case 2:
			
			System.out.println("Introduce el lado del cuadrado");
			int lado = in.nextInt();
		
			area = Math.pow(lado,2);
			
			System.out.print("El área del cuadrado es:");
			break;
			
		case 3:
			System.out.println("Introduce el lado del pentágono");
			double ladoPentagono = in.nextDouble();
			
			double apotema = (ladoPentagono/2)/Math.tan(Math.toRadians(36));
			
			area = (ladoPentagono*apotema*5/2);
			
			System.out.print("El área del pentágono es:");
			
			break;
			
		case 4:
			
			System.out.println("Introduce el radio del círculo");
			double radio = in.nextDouble();
			
			area = Math.PI * radio;
			
			System.out.print("El área del círculo es:");
			
			break;
			
		default:
			
			System.out.println("No has introducido una opción correcta");
		}
		
		System.out.println(area);
		
		in.close();
		
	}
}
