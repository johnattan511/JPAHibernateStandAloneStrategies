package POJOS;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(referencedColumnName="id")

//@DiscriminatorValue(value = "jugadoraso")
public class Futbolista extends Persona{

	private String equipoFavorito;
	private String equipoDondeJuega;
	
	public Futbolista(){
		
	}
	
	public Futbolista(String equipoFavorito, String equipoDondeJuega) {
		super();
		this.equipoFavorito = equipoFavorito;
		this.equipoDondeJuega = equipoDondeJuega;
	}
	
	public String getEquipoFavorito() {
		return equipoFavorito;
	}
	public void setEquipoFavorito(String equipoFavorito) {
		this.equipoFavorito = equipoFavorito;
	}
	public String getEquipoDondeJuega() {
		return equipoDondeJuega;
	}
	public void setEquipoDondeJuega(String equipoDondeJuega) {
		this.equipoDondeJuega = equipoDondeJuega;
	}
	
	
}
