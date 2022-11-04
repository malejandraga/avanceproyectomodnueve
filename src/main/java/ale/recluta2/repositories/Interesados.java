package ale.recluta2.repositories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ale.recluta2.repositories.InteresadoEntity;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Interesados implements Serializable {

	private static final long serialVersionUID = 3172390575100661490L;
	private List<InteresadoEntity> inters = new ArrayList<InteresadoEntity>();

	public Interesados() {
		inters = new ArrayList<InteresadoEntity>();
		InteresadoEntity prueba = new InteresadoEntity();
		prueba.setNombres("Prueba");
		prueba.setApellidos("Probando 1,2,3...");
		prueba.setUsuario("prueba");
		prueba.setContrasenia("123");
		inters.add(prueba);
	}

	public List<InteresadoEntity> getInteresados() {
		return inters;
	}

	public void setInteresados(List<InteresadoEntity> interesados) {
		this.inters = interesados;
	}

}
