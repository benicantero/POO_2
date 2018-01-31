package com.iesvirgendelcarmen_poo2_teoria;

public class MiembrosInstanciaEstaticos {
	//variables de instancia (solo para el objeto)
	private int valorNumerico;
	private String valorCadena;
	//variables de clase (siempre con el modificador static)
	private static int valorEstaticoNumerico;
	private static String valorEstaticoCadena;
	
	
	public int getValorNumerico() {
		return valorNumerico;
	}

	public void setValorNumerico(int valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	public String getValorCadena() {
		return valorCadena;
	}

	public void setValorCadena(String valorCadena) {
		this.valorCadena = valorCadena;
	}

	public static int getValorEstaticoNumerico() {
		return valorEstaticoNumerico;
	}

	public static void setValorEstaticoNumerico(int valorEstaticoNumerico) {
		MiembrosInstanciaEstaticos.valorEstaticoNumerico = valorEstaticoNumerico;
	}

	public static String getValorEstaticoCadena() {
		return valorEstaticoCadena;
	}

	public static void setValorEstaticoCadena(String valorEstaticoCadena) {
		MiembrosInstanciaEstaticos.valorEstaticoCadena = valorEstaticoCadena;
	}

	@Override
	public String toString() {
		return "MiembrosInstanciaEstaticos [valorNumerico=" + valorNumerico + ", valorCadena=" + valorCadena + "]";
	}
	
	
	
}
