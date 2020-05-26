package progavanzada.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amantes")
public class Amante {

	@Id
	private int id  ;
	private String estatus ; 
	private String estado  ; //Ejecutado , No digno , Digno 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Amante(int id, String estatus, String estado) {
		super();
		this.id = id;
		this.estatus = estatus;
		this.estado = estado;
	}
	public Amante() {
		super();
	}
	
	
	
	
	
}
