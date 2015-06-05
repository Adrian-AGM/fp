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
		//Calculo del seno
		Double seno=(double) Math.round(Math.sin(Math.toRadians(n))*10)/10;
		return seno;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	
	static int[] stepThisNumber(int number, int step) {
		int[] array;
		if(number!=0 && step !=0){
			ArrayList<Integer> arrayL = new ArrayList<>();
			//Step
			for(int x = number-step; x >= 1; x -= step){
				arrayL.add(x);
			}
			//Conversion de arrayList a array
			array = new int[arrayL.size()];
		    int i = 0;
		    for (Integer n1 : arrayL) {
		        array[i++] = n1;
		    }
			
		}
		else{
			array= new int[1];
		}
		return array;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	
	static int[] divisors(int n) {
		ArrayList<Integer> arrayL = new ArrayList<>();
		if(n<=20 && n>0){
			//Comprobacion de divisores
			for (int i = n ; i >= 1 ; i--){
				if (n % i == 0){
					arrayL.add(i);	
				}
			}
			//Conversion de arrayList a array
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
		if(apuesta!=null && aciertos!=null){
			//Compara uno a uno
			for(int x=0; x<6; x++)
				if(apuesta.get(x).equals(aciertos.get(x)))
					cont++;
			return cont;
		}
		else{
			return 0;
		}
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		//Strings con los strings necesarios para cada numero
		String [] unidades = {"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
		String [] decenas = {"Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
		String [] otros = {"Diez","Once","Doce","Trece","Catorce","Quince"};
		String numberString = null;
		//Switch para concatenar en funcion del numero
		switch(n/10){
			case 0: numberString = unidades[n%10];
					break;
			case 1: 
					if(n%10 < 6){
						numberString = otros[n%10];
					}else if(n%10 >= 6){
						numberString = "Dieci" + unidades[n%10];
					};
					break;
			case 2:
					switch(n%10){
						case 0: numberString = decenas[n/10-2];
								break;
						default: numberString = "Veinti" + unidades[n%10].toLowerCase();
								break;
					}
					break;
			case 3: case 4: case 5: case 6: case 7: case 8: case 9:
					switch(n%10){
						case 0: numberString = decenas[n/10-2];
								break;
						default: numberString = decenas[n/10-2] + " y " + unidades[n%10].toLowerCase();
								break;
					}
					break;
			default: numberString = "Numero no valido";
					break;
		}
		return numberString;
	}
	
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	static boolean isLeapYear(String fecha) {
		boolean leap = false;
		if(fecha.length()==10){
			int anyo;
			anyo = Integer.parseInt(fecha.substring(6));
			//Comprueba si es bisiesto
			leap = anyo%4 == 0 && (anyo%100 != 0 || anyo%400 == 0);
			return leap;
		}
		else{
			return leap;
		}
	}

	/*
	 * este metodo calgula la tangente de un angulo
	 */
	static boolean isValidDate(String date) {
		return false;
	}
}
