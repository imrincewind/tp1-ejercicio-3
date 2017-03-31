package tpProg;

public class Pila {
	MySimpleLinkedList lista = new MySimpleLinkedList();
	private final int TOP = 0;
	public Pila() {
		
	}
	
public void apilar(String s){
	this.lista.insertElementFirstPos(s);
}
public void desapilar(){
	this.lista.deleteElement(TOP);
}
public String tope(){
	return this.lista.elementAt(TOP).getInfo();
}
public boolean isEmpty(){
	return this.lista.isEmpty();
}
}
