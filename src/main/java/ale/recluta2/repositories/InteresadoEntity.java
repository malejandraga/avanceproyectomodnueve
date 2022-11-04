package ale.recluta2.repositories;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class InteresadoEntity implements Serializable {

	private static final long serialVersionUID = -8931064633767324069L;

	private int id;
	private String nombres;
	private String apellidos;
	private String usuario;
	private String contrasenia;
	
	public InteresadoEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "InteresadoEntity [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", usuario="
				+ usuario + ", contrasenia=" + contrasenia + "]";
	}

}
