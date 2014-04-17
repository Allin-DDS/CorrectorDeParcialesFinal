package ar.edu.utn.frba.dds.correctorDeParciales.CorrectorDeParcialesFinal;


public class VerdaderoOFalso implements TipoDePregunta {
	 
boolean respuestaCorrecta;
public boolean isRespuestaCorrecta() {
	return respuestaCorrecta;
}
public void setRespuestaCorrecta(boolean respuestaCorrecta) {
	this.respuestaCorrecta = respuestaCorrecta;
}
public VerdaderoOFalso(boolean respuestaCorrecta)
{	this.respuestaCorrecta=respuestaCorrecta;
	}
}