package ar.edu.utn.frba.dds.correctorDeParciales.CorrectorDeParcialesFinal;



public class Pregunta  {
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	int numero;
	String nombre;
	int puntaje;
	
	TipoDePregunta tipoDePregunta;
	
	
	public Pregunta(int numero, int puntaje,String nombre, TipoDePregunta tipoDePregunta){
		this.numero = numero;
		this.puntaje= puntaje;
		this.nombre= nombre;
		this.tipoDePregunta=tipoDePregunta;
		};
}

