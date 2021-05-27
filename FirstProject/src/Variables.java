
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad = 35;
		
		//Comentario
		System.out.println(edad);
		
		edad = 20;
		
		System.out.println(edad);
		
		//Constante
		final int  edadNueva = 20;
		
		System.out.println(edadNueva);
		
		int a,b,c;
		
		a=2;
		
		b=7/2;
		
		c=10;
		c++;
		
		System.out.println("a("+ a + ") + b(" + b + ") + c(" + c + ")=" +(a + b -c));

		
		final double aPulgadas = 2.54;
		double cm = 16;
		double resultado = cm/aPulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " resultado");
		
		System.out.println(Math.sqrt(cm));
		System.out.println(Math.pow(a, b));
		
		double num1 = 5.85;
		
		int redondeo = (int)Math.round(num1);
		
		System.out.println(redondeo);
		
		
		
		
	}

}
