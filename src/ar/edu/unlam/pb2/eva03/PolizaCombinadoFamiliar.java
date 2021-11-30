package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza  implements SegurosDeVida {

	private Map<Persona,TipoDeBeneficiario> beneficiarios;
	private List <Vivienda> viviendas;
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios=new HashMap<>();
		this.viviendas=new ArrayList<>();
	}

	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		this.beneficiarios.put(hijo, hijo2);
		
	}

	@Override
	public Object obtenerCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}

	public void agregarBienAsegurado(Vivienda casa) {
		this.viviendas.add(casa);
		
	}

}
