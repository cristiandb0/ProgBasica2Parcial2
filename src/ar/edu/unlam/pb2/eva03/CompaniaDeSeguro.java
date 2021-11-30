package ar.edu.unlam.pb2.eva03;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> poliza;
	private Integer numeroDePoliza;
	private Boolean fueRobado;

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.poliza = new TreeSet<>();
		this.numeroDePoliza = numeroDePoliza;
		this.fueRobado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarPoliza(Poliza poliza) {
		this.poliza.add(poliza);

	}

	public Object obtenerLaCantidadDePolizasEmitidas() {

		return this.poliza.size();
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(numeroDePoliza, poliza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompaniaDeSeguro other = (CompaniaDeSeguro) obj;
		return Objects.equals(numeroDePoliza, other.numeroDePoliza) && Objects.equals(poliza, other.poliza);
	}

	public void denunciarSiniestro(int i) throws PolizaInexistente {
		Boolean seEncontroPoliza = false;
		for (Poliza poliza : poliza) {
			if (poliza.getNumeroDePoliza().equals(i)) {
				this.fueRobado = true;
				seEncontroPoliza = true;
				break;
			}
		}
		if (!seEncontroPoliza) {
			throw new PolizaInexistente();
		}

	}

	public Poliza getPoliza(int i) throws PolizaInexistente {
		for (Poliza poliza : poliza) {
			if (poliza.getNumeroDePoliza().equals(i)) {
				return poliza;
			}
		}
		return null;
	}

	public void setPoliza(Set<Poliza> polizas) {
		this.poliza = polizas;
	}

	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	public Boolean fueRobado() {
		return fueRobado;
	}

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}

}
