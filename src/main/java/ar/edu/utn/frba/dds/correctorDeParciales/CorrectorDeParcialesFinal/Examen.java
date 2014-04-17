package ar.edu.utn.frba.dds.correctorDeParciales.CorrectorDeParcialesFinal;



import java.util.ArrayList; 
import java.util.Collection;


public class Examen  {
	Collection<Pregunta> preguntas = new ArrayList<Pregunta>();
	Collection<RespuestaAlumno> respuestas = new ArrayList<RespuestaAlumno>();

		
		public Examen(Collection<Pregunta> preguntas,Collection<RespuestaAlumno> respuestas)
		{
			this.preguntas=preguntas;
			this.respuestas=respuestas;
		}
	
		public void pregunta(int numero, int puntaje,String nombre, TipoDePregunta tipoDePregunta){
			preguntas.add(new Pregunta(numero, puntaje,nombre,tipoDePregunta));
		}
			public void respuestasDelExamen(int numero, TipoDePregunta respuesta){
				respuestas.add(new RespuestaAlumno(numero,respuesta));
		}
		//compara la respuesta del alumno con la del docente 
			//aca es donde se debe estar generando el problema del test4 no me doy cuenta porque
		public boolean respuestaCorrecta(TipoDePregunta respuesta,TipoDePregunta pregunta){
			return (respuesta==pregunta);
		}
	
		
		//no nos funciono los streams(cosa que no pudimos entender porque) por eso tuvimos que hacerlo de esta forma
		public int puntaje(RespuestaAlumno respuesta)
		{
			Pregunta laPregunta = null;
			int puntos = 0;
			for (Pregunta pregunta: preguntas)
			{
				if (pregunta.numero==respuesta.numero){
					laPregunta = pregunta;
				}
			}
				if(respuestaCorrecta(respuesta.respuesta,laPregunta.tipoDePregunta)) {
					puntos= laPregunta.puntaje;
				}
				return puntos;
		}
		
		
		//saca el puntaje general que generan la sumatoria de puntajes de las preguntas, se usa para sacar la nota(tambien se va a poder hacer con stream)
		public int puntajeTotal(){
			int acum =0;
			for(Pregunta pregunta: preguntas)
			{
				acum= acum + pregunta.puntaje;
			}
			return acum;
		}
		
		// para obtener la nota(tambien se va a poder hacer con stream)
		public double nota()
		{
			double acum =0;
			
			for(RespuestaAlumno respuesta: respuestas)
			{
				
				acum = acum + this.puntaje(respuesta);
				
			}
				double laNota =  acum*10/this.puntajeTotal();
				return(laNota);
		}
}

