package util;

public class Calculadora {
	
	public static final double PI = 3.14159;
	
/*	
	o "final" indica que o PI passa de uma variável para uma constante que não pode ser alterada
	posteriormente. O padrão para nomear constantes é letras MAIÚSCULAS separadas por _
*/
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
