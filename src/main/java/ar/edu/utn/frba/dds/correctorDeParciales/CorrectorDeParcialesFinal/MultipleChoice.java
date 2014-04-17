package ar.edu.utn.frba.dds.correctorDeParciales.CorrectorDeParcialesFinal;


public class MultipleChoice implements TipoDePregunta {
	
	String  respuestaCorrecta;
	public String  isRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(String  respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public MultipleChoice (String respuestaCorrecta)
	{	this.respuestaCorrecta=respuestaCorrecta;
		}

}
