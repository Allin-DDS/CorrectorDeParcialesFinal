package ar.edu.utn.frba.dds.correctorDeParciales.CorrectorDeParcialesFinal;


public class PreguntaConcreta implements TipoDePregunta {
	
	String  respuestaCorrecta;
	public String  isRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(String  respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public PreguntaConcreta (String respuestaCorrecta)
	{	this.respuestaCorrecta=respuestaCorrecta;
		}
	
}
