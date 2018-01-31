package com.iesvirgendelcarmen_poo2_teoria;

import java.util.ArrayList;
import java.util.List;

public class TestCirulos {

	public static void main(String[] args) {
		
		List<Circulo> listaCirulos = new ArrayList<>();
		for (int i = 0 ; i < 1000; i++) {
			/*int radioAleatorio = (int) (Math.random() * 1000 + 1);
			Circulo c = new Circulo (radioAleatorio);
			listaCirulos.add(c);*/
			listaCirulos.add(new Circulo ((int) (Math.random() * 1000 + 1))); //igual que anterior pero refactorizado
		}
		listaCirulos.add(299,new Circulo(100));
		System.out.println("Numero de circulos " + Circulo.numeroCirculos);
		System.out.println(listaCirulos.get(299)); // posicion 300 de la lista

	}

}
