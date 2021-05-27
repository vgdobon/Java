import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad = in.nextInt();
		
		if(edad<18){
			
			System.out.println("Eres menor de edad");
		}else if(edad<40){
			
			System.out.println("Eres joven");
		}else if (edad < 65){
			
			System.out.println("Eres maduro");
		}else{
			
			System.out.println("Cuidate!!");
		}
		
		in.close();
		
	}

}
