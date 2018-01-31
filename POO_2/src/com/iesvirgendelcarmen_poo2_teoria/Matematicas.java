package com.iesvirgendelcarmen_poo2_teoria;

import java.util.ArrayList;
import java.util.List;

public class Matematicas {

	public static void main(String[] args) {
		//calculo del factorial de un nº
		//7! = 7 * 6 * 5 ... * 1
		//4! = 4 * 3 * 2 * 1
	System.out.println(factorial(20));
	Matematicas matematicas = new Matematicas();
	System.out.println(matematicas.buscarMultiplos(50,7));
	
}
	public static long factorial (int numero) {
		long resultado = 1;
		for (int i = numero; i > 0; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
	//buscamos multiplos de un numero dentro de un rango
	// buscrMultiplo(20,3) -> 3,6,9,12,15,18
	// buscarMultiplos(50,7) -> 7,14,21,28,35,42,49
	public List<Integer> buscarMultiplos (int rango, int numero){
		List<Integer> listaDeMultiplos = new ArrayList<>();
		for (int i = numero; i <= rango; i++) {
			if (i % numero == 0) listaDeMultiplos.add(i);
		}
		return listaDeMultiplos;
	}
}
