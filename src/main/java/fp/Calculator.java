package fp;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	public Calculator(){
		
	}
	/*
	 * este metodo calcula el seno de un angulo
	 */
	static Double sin(double n) {
		Double seno=(double) Math.round(Math.sin(Math.toRadians(n))*10)/10;
		return seno;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	@SuppressWarnings("null")
	static int[] stepThisNumber(int number, int step) {
		int[] array = {0};
		int y = 0;
		if(number!=0 && step !=0)
			for(int x = number-1; x >= 0+step; x -= step){
				array[y] = x;
				y++;
			}
		return array;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	@SuppressWarnings("null")
	static int[] divisors(int n) {
		ArrayList<Integer> arrayL = new ArrayList<>();
		int x=0;
		if(n<=20 && n>0){
			for (int i = n ; i >= 1 ; i--){
				if (n % i == 0){
					arrayL.add(i);
					x++;	
				}
			}
			int[] array = new int[arrayL.size()];
		    int i = 0;
		    for (Integer n1 : arrayL) {
		        array[i++] = n1;
		    }
			return array;
		}
		else{
			System.out.println("Numero fuera de rango.");
			return null;
		}
	}
	
	/*
	 * Toma como parámetros dos listas. La primera con los 6 números de una
	 * apuesta de la primitiva, y la segunda con los 6 números ganadores. La
	 * función debe devolver el número de aciertos.
	 */
	static Integer checkMyBet(List<Integer> apuesta, List<Integer> aciertos) {
		int cont=0;	
		for(int x=0; x<6; x++)
			if(apuesta.get(x).equals(aciertos.get(x)))
				cont++;
		return cont;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		return null;
	}
	
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	static boolean isLeapYear(String fecha) {
		return false;
	}

	/*
	 * este metodo calgula la tangente de un angulo
	 */
	static boolean isValidDate(String date) {
		return false;
	}
}
