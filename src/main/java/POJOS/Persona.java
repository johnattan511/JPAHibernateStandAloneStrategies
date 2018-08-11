package POJOS;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table
@Entity

@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

//@Inheritance( strategy = InheritanceType.JOINED )

/*@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "personaje" )
@DiscriminatorValue( value = "personajillo" )*/
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nombre;
	private String edad;
	private String correo;
	
	

	public Persona() {
		super();
	}

	public Persona(int id, String nombre, String edad, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
