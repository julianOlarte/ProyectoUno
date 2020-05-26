package progavanzada.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subditos")
public class Subdito {

	@Id
	private int id  ;
	private String nombre;
	private int numHijos;
	private String nomHijos ;
	private String problema ;
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
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public String getNomHijos() {
		return nomHijos;
	}
	public void setNomHijos(String nomHijos) {
		this.nomHijos = nomHijos;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public Subdito(int id, String nombre, int numHijos, String nomHijos, String problema) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numHijos = numHijos;
		this.nomHijos = nomHijos;
		this.problema = problema;
	}
	public Subdito() {
		super();
	}
	public Subdito(String nombre, int numHijos, String nomHijos, String problema) {
		super();
		this.nombre = nombre;
		this.numHijos = numHijos;
		this.nomHijos = nomHijos;
		this.problema = problema;
	}
	
	
	

	
	
	
	
	
	
}
