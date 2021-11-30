package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public interface SegurosGenerales {

	void agregarBienAsegurado(Auto auto);

	Object getNumeroDePoliza();

	Object getAuto();

	Object getAsegurado();

	Object getPremio();
	
}
