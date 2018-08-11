package POJOS;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(referencedColumnName="id")

//@DiscriminatorValue(value = "metacho")
public class Metalero extends Persona{

	private String bandaFavorita;
	private String instrumentoFavorito;

	public Metalero(){
		
	}
	
	public Metalero(String bandaFavorita, String instrumentoFavorito) {
		super();
		this.bandaFavorita = bandaFavorita;
		this.instrumentoFavorito = instrumentoFavorito;
	}

	public String getBandaFavorita() {
		return bandaFavorita;
	}

	public void setBandaFavorita(String bandaFavorita) {
		this.bandaFavorita = bandaFavorita;
	}

	public String getInstrumentoFavorito() {
		return instrumentoFavorito;
	}

	public void setInstrumentoFavorito(String instrumentoFavorito) {
		this.instrumentoFavorito = instrumentoFavorito;
	}

}
