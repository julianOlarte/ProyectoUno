package progavanzada.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dragones")
public class Dragon {
	@Id	
	private int id ;
	private String edad ;
	private String fuerza ; 
	private String color ; 
	private String nombre ; 
	private String comidaFav ; 
	private String asesinatos ; //personas asesinadas
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getFuerza() {
		return fuerza;
	}
	public void setFuerza(String fuerza) {
		this.fuerza = fuerza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getComidaFav() {
		return comidaFav;
	}
	public void setComidaFav(String comidaFav) {
		this.comidaFav = comidaFav;
	}
	public String getAsesinatos() {
		return asesinatos;
	}
	public void setAsesinatos(String asesinatos) {
		this.asesinatos = asesinatos;
	}
	public Dragon(int id, String edad, String fuerza, String color, String nombre, String comidaFav,
			String asesinatos) {
		super();
		this.id = id;
		this.edad = edad;
		this.fuerza = fuerza;
		this.color = color;
		this.nombre = nombre;
		this.comidaFav = comidaFav;
		this.asesinatos = asesinatos;
	}
	public Dragon(String edad, String fuerza, String color, String nombre, String comidaFav, String asesinatos) {
		super();
		this.edad = edad;
		this.fuerza = fuerza;
		this.color = color;
		this.nombre = nombre;
		this.comidaFav = comidaFav;
		this.asesinatos = asesinatos;
	}
	public Dragon() {
		super();
	}
	@Override
	public String toString() {
		return "dragones [id=" + id + ", edad=" + edad + ", fuerza=" + fuerza + ", color=" + color + ", nombre="
				+ nombre + ", comidaFav=" + comidaFav + ", asesinatos=" + asesinatos + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
