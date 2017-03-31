package tpProg;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		String s = "TOPE:";
		
		for(int i = 1; i <= 3000; i++){
			pila.apilar(s + " " + i);
		}
		
		for(int i = 1; i <= 3000; i++){		
		System.out.println(pila.tope());
		pila.desapilar();
		}
		
		

	}

}
