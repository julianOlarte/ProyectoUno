package progavanzada.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amorios")
public class Persona {
	@Id
	private int id;
	private String lugar;
	private String claseSocial;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getClaseSocial() {
		return claseSocial;
	}
	public void setClaseSocial(String claseSocial) {
		this.claseSocial = claseSocial;
	}
	public Persona(int id, String lugar, String claseSocial) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.claseSocial = claseSocial;
	}
	
	
	public Persona() {
		super();
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", lugar=" + lugar + ", claseSocial=" + claseSocial + "]";
	}
	
	
	public String obtenerClase () {
		
		return claseSocial;
	}
	
	
	
}
