package ale.recluta2.beans;

import java.io.Serializable;

import ale.recluta2.repositories.BaseDeDatos;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Empleado implements Serializable {

	private static final long serialVersionUID = -6792405279727604320L;

	private int id;
	private String nombres;
	private String apellidos;
	private String usuario;
	private String contrasenia;
	private String tipo;
	private BaseDeDatos bd;

	public Empleado() {
		bd = new BaseDeDatos();
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BaseDeDatos getBd() {
		return bd;
	}

	@Override
	public String toString() {
		return "Empleado [nombres=" + nombres + ", apellidos=" + apellidos + ", usuario=" + usuario + ", contrasenia="
				+ contrasenia + ", tipo=" + tipo + "]";
	}

	public String loginadm() {
		System.out.println("DB\t Usuario: " + this.usuario + "\tContraseña: " + this.contrasenia);
		if (bd.existe(this)) {
			return "administracion";
		} else {
			return "index";
		}

		// return "index";
	}

	public String registro() {
		System.out.println("Registro\nid: " + this.id + "\nNombres: " + this.nombres + "\nApellidos: " + this.apellidos
				+ "\nUsuario: " + this.usuario + "\nContraseña: " + this.contrasenia);
		bd.registraEmpleado(this);

		return "empleados";
	}

	public String salir() {
		System.out.println("Registro\nid: " + this.id + "\nNombres: " + this.nombres + "\nApellidos: " + this.apellidos
				+ "\nUsuario: " + this.usuario + "\nContraseña: " + this.contrasenia);
		
		return "index";
	}

}
