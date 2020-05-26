package progavanzada.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guerreros")
public class Guerrero {
	
	@Id
	private int id  ;
	private String nombre ;
	private String especialidad;
	private String cargo;
	private String asesinatos;
	private String interes ;
	
	
	
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getAsesinatos() {
		return asesinatos;
	}

	public void setAsesinatos(String asesinatos) {
		this.asesinatos = asesinatos;
	}

	public String getInteres() {
		return interes;
	}

	public void setInteres(String interes) {
		this.interes = interes;
	}


	public Guerrero(int id, String nombre, String especialidad, String cargo, String asesinatos, String interes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.cargo = cargo;
		this.asesinatos = asesinatos;
		this.interes = interes;
	}
	
	public Guerrero(String nombre, String especialidad, String cargo, String asesinatos, String interes) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.cargo = cargo;
		this.asesinatos = asesinatos;
		this.interes = interes;
	}

	public Guerrero() {
		super();
	}
	
	
	
	
	
	
}
