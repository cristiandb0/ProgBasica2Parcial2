package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
private Auto auto;
	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.auto=null;
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.auto=auto;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	
	
	

}
