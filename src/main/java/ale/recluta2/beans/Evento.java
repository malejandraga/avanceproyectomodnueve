package ale.recluta2.beans;

import java.io.Serializable;

import ale.recluta2.repositories.BaseDeDatos;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Evento implements Serializable {

	private static final long serialVersionUID = -8564269699533803727L;

	private int id;
	private String nombre;
	private String descripcion;
	private String fecha_inicio;
	private String fecha_fin;
	private int duracion;
	private String horario;
	private double precio;
	private String imagen;
	private String estatus;
	private String tipoEvento;
	private String modalidad;
	private BaseDeDatos bd;

	public Evento() {
		bd = new BaseDeDatos();
	}

//	public Evento(int id, String nombre, String descripcion, String fecha_inicio, String fecha_fin, int duracion,
//			String horario, double precio, String tipoEvento, String modalidad) {
//		super();
//		this.id = id;
//		this.nombre = nombre;
//		this.descripcion = descripcion;
//		this.fecha_inicio = fecha_inicio;
//		this.fecha_fin = fecha_fin;
//		this.duracion = duracion;
//		this.horario = horario;
//		this.precio = precio;
//		this.tipoEvento = tipoEvento;
//		this.modalidad = modalidad;
//		this.imagen = "sin_imagen.jpg";
//		this.estatus = "ACTIVO";
//	}

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public BaseDeDatos getBd() {
		return bd;
	}
	
	
	public String registro() {
		System.out.println("Registro\nid: " + this.id + "\nNombre: " + this.nombre );
		bd.registraEvento(this);

		return "catalogo";
	}

	

}
