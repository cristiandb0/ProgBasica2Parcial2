package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {
	private Map<Persona,TipoDeBeneficiario>beneficiarios;
	
	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios=new HashMap<>();
	}

	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		this.beneficiarios.put(hijo, hijo2);
		
	}

	@Override
	public Object obtenerCantidadDeBeneficiarios() {
		
		return this.beneficiarios.size();
	}

	public boolean tuvoAlgunAccidente() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
