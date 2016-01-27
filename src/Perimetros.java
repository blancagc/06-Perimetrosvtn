/**
 * 
 * @author Blanca
 *
 */
public class Perimetros {
	/**
	 * 
	 * @param lado de tipo entero
	 * @return la suma de los lados
	 */
	public int cuadrado(int lado){
		return lado + lado +lado + lado;
	}
	/**
	 * 
	 * @param altura tipo entero
	 * @param base tipo entero
	 * @return regresa la suma de los 4 lados
	 */
	public int rectangulo(int altura, int base){
		return 2*(altura+base);
	}
	/**
	 * 
	 * @param lado tipo entero
	 * @return la suma de los 3 lados
	 */
	public int trianguloE(int lado){
		return lado+lado+lado;
	}
	/**
	 * 
	 * @param lado tipo entero
	 * @param base tipo entero
	 * @return el resultado de la suma de lado + lado + base
	 */
	public int trianguloI(int lado, int base){
		return lado+lado+base;
	}
	/**
	 * 
	 * @param lado1 tipo entero
	 * @param lado2 tipo entero
	 * @param lado3 tipo entero
	 * @return la suma de los 3 lados
	 */
	public int trianguloEs(int lado1, int lado2, int lado3){
		return lado1+lado2+lado3;
	}
	/**
	 * 
	 * @param radio tipo double
	 * @return la operacion realizada para calcular el perimetro
	 */
	public double circulo(double radio){
		return 2*3.1416*radio;
		
	}
	
}
