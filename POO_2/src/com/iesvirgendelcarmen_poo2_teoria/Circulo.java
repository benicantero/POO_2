package com.iesvirgendelcarmen_poo2_teoria;

public class Circulo {
	
	private int radio;
	public static int numeroCirculos = 0;
	
	public Circulo(int radio) {
		this.radio = radio;
		numeroCirculos ++; // se incrementa el numero de circulos
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	

}
