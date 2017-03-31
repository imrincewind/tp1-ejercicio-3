package tpProg;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		String s = "hola";
		String a = "hola2";
		String b = "hola3";
		String c = "hola4";
		
		pila.apilar(s);
		pila.apilar(a);
		pila.apilar(b);
		pila.apilar(c);
		ArrayList<String> array = new ArrayList();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		

	}

}
