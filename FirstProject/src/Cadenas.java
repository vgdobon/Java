
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre ="Víctor";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de "+ nombre + " es "+ nombre.charAt(0) +
							" y la ultima letra es la " +  nombre.charAt(nombre.length() - 1));
		
		String nombreCompleto ="Víctor Pérez Villa";
		
		String apellidos = nombreCompleto.substring(7,nombreCompleto.length());
		
		System.out.println(apellidos);
		
		String alumno1 , alumno2;
		
		alumno1 ="David";
		
		alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2));
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
		
	}

}
