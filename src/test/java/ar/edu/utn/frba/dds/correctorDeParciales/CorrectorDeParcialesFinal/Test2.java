package ar.edu.utn.frba.dds.correctorDeParciales.CorrectorDeParcialesFinal;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;  


public class Test2 {

public Examen examen;
public Pregunta pregunta;
public RespuestaAlumno respuesta;
public TipoDePregunta tipoV;
public TipoDePregunta tipoF;
public TipoDePregunta tipoMC;
public TipoDePregunta tipoPC;
public TipoDePregunta tipoPCR;
Collection<Pregunta> preguntas = new ArrayList<Pregunta>();
Collection<RespuestaAlumno> respuestas = new ArrayList<RespuestaAlumno>();

	@Before 
	
	public void ingresarExamen()
	{
		this.tipoV= new VerdaderoOFalso(true);
		this.tipoF = new VerdaderoOFalso(false);
		this.tipoMC = new MultipleChoice("A");
		this.tipoPC = new PreguntaConcreta("Madrid");
		this.tipoPCR = new PreguntaConcreta("Madrid");
	
		//la pregunta cuatro en junit me tira error pero en maven me da OK 
		
		preguntas.add(new Pregunta(1, 5,"Domingo Cavallo estatizo la deuda privada como presintende del Banco Central en 1982",tipoV));
		preguntas.add(new Pregunta(2, 5,"El resultado de 1+1 es",tipoMC));
		preguntas.add(new Pregunta(3, 5,"Domingo ",tipoPC));
		preguntas.add(new Pregunta(4, 5,"Cual es la capital de España",tipoPC));
		
		respuestas.add(new RespuestaAlumno(1,tipoF));
		respuestas.add(new RespuestaAlumno(2,tipoMC));
		respuestas.add(new RespuestaAlumno(3,tipoPC));
		respuestas.add(new RespuestaAlumno(4,tipoPCR));
		
		this.examen= new Examen(preguntas,respuestas);
	}
	
	
	@Test 
	public void Test()
	{
		double resultado=examen.nota();
		//return (resultado);
		assertTrue(resultado == 7.5);  
	
	}
	
}
