package progavanzada.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="territorios")
public class Territorio {

	@Id
	private int id ;
	private String nombre ;
	private String clima  ;
	private String productos ;
	private int subditosConseguidos ;
	
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
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public int getSubditosConseguidos() {
		return subditosConseguidos;
	}
	public void setSubditosConseguidos(int subditosConseguidos) {
		this.subditosConseguidos = subditosConseguidos;
	}
	public Territorio(int id, String nombre, String clima, String productos, int subditosConseguidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clima = clima;
		this.productos = productos;
		this.subditosConseguidos = subditosConseguidos;
	}
	public Territorio() {
		super();
	}
	
	
	
	
}
