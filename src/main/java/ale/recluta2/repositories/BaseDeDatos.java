package ale.recluta2.repositories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import ale.recluta2.beans.Empleado;
import ale.recluta2.beans.Evento;
import ale.recluta2.beans.Interesado;

@Named("db")
@ApplicationScoped
public class BaseDeDatos implements Serializable {

	private static final long serialVersionUID = 4180657527267951184L;

	private List<EventoEntity> eventos;
	private List<InteresadoEntity> interesados;
	private List<EmpleadoEntity> empleados;

	public BaseDeDatos() {

		System.out.println("Cree la base de datos");
		this.interesados = new ArrayList<InteresadoEntity>();
		this.eventos = new ArrayList<EventoEntity>();
		this.empleados = new ArrayList<EmpleadoEntity>();

		/* INTERESADOS */
		InteresadoEntity prueba = new InteresadoEntity();
		prueba.setId(0);
		prueba.setNombres("Prueba");
		prueba.setApellidos("Probando 1,2,3...");
		prueba.setUsuario("prueba");
		prueba.setContrasenia("123");
		interesados.add(prueba);

		/* EMPLEADOS */
		EmpleadoEntity admin = new EmpleadoEntity();
		admin.setId(7);
		admin.setNombres("María Alejandra");
		admin.setApellidos("Gtz. A.");
		admin.setUsuario("maga");
		admin.setContrasenia("ABC");
		empleados.add(admin);

		/* EVENTOS */

		EventoEntity evento = new EventoEntity();
		evento.setId(0);
		evento.setNombre("Evento");
		evento.setDescripcion("......................");
		evento.setFecha_inicio("20220101");
		evento.setFecha_fin("20220131");
		evento.setDuracion(20);
		evento.setHorario("Miercoles 18:00 a 20:00");
		evento.setPrecio(1000.00);
		evento.setTipoEvento("CURSO");
		evento.setModalidad("EN_LINEA");

//		EventoEntity evento = new EventoEntity(0, "Evento", "......................", "20220101", "20220131", 20,
//				"Miercoles 18:00 a 20:00", 1000.00, "CURSO", "EN_LINEA");
////		Map<String, Empleado> responsables = new HashMap<String, Empleado>();
////		responsables.put("INSTRUCTOR", empleado_diez);
////		responsables.put("INSTRUCTOR", empleado_siete);
////		responsables.put("COORDINADOR", empleado);
////		evento.setResponsables(responsables);
//
//		Evento evento_uno = new Evento(1, "Evento_uno", "......................", "20220201", "20220201", 4,
//				"Lunes a Viernes de 20:00 a 21:00", 500.00, "CONFERENCIA", "EN_LINEA");
////		Map<String, Empleado> responsables_uno = new HashMap<String, Empleado>();
////		responsables_uno.put("CONFERENCISTA", empleado);
////		responsables_uno.put("CONFERENCISTA", empleado_dos);
////		responsables_uno.put("CONFERENCISTA", empleado_tres);
////		responsables_uno.put("CONFERENCISTA", empleado_cuatro);
////		responsables_uno.put("MODERADOR", empleado_diez);
////		evento_uno.setResponsables(responsables_uno);
//
//		Evento evento_dos = new Evento(2, "Evento_dos", "......................", "202203201", "20220512", 20,
//				"Lunes a Viernes de 20:00 a 21:00", 500.00, "CURSO", "PRESENCIAL");
////		Map<String, Empleado> responsables_dos = new HashMap<String, Empleado>();
////		responsables_dos.put("PROFESOR", empleado_diez);
////		evento_dos.setResponsables(responsables_dos);
//
//		Evento evento_tres = new Evento(3, "Evento_tres", "......................", "20220201", "20220212", 30,
//				"Lunes a Viernes de 20:00 a 21:00", 500.00, "CURSO", "EN_LINEA");
////		Map<String, Empleado> responsables_tres = new HashMap<String, Empleado>();
////		responsables_tres.put("INSTRUCTOR", empleado);
////		responsables_tres.put("INSTRUCTOR", empleado_cuatro);
////		responsables_tres.put("COORDINADOR", empleado_diez);
////		evento_tres.setResponsables(responsables_tres);
//
//		Evento evento_cuatro = new Evento(4, "Evento_cuatro", "......................", "20220514", "20220514", 20,
//				"Lunes 16:00 a 20:00", 700.00, "TALLER", "PRESENCIAL");
////		Map<String, Empleado> responsables_cuatro = new HashMap<String, Empleado>();
////		responsables_cuatro.put("CONFERENCISTA", empleado);
////		responsables_cuatro.put("CONFERENCISTA", empleado_cuatro);
////		responsables_cuatro.put("CONFERENCISTA", empleado_nueve);
////		responsables_cuatro.put("CONFERENCISTA", empleado_siete);
////		responsables_cuatro.put("MODERADOR", empleado_diez);
////		evento_cuatro.setResponsables(responsables_cuatro);
//
//		Evento evento_cinco = new Evento(5, "Evento_cinco", "......................", "20220201", "20220212", 2,
//				"Viernes de 19:00 a 21:00", 500.00, "CHARLA", "VIRTUAL");
////		Map<String, Empleado> responsables_cinco = new HashMap<String, Empleado>();
////		responsables_cinco.put("CONFERENCISTA", empleado_diez);
////		responsables_cinco.put("CONFERENCISTA", empleado_cinco);
////		evento_cinco.setResponsables(responsables_cinco);
//
//		Evento evento_seis = new Evento(6, "Evento_seis", "......................", "20220201", "20220212", 4,
//				"Jueves de 16:00 a 20:00", 0.00, "CONFERENCIA", "VIRTUAL");
////		Map<String, Empleado> responsables_seis = new HashMap<String, Empleado>();
////		responsables_seis.put("CONFERENCISTA", empleado_cinco);
////		responsables_seis.put("CONFERENCISTA", empleado_dos);
////		responsables_seis.put("CONFERENCISTA", empleado_ocho);
////		responsables_seis.put("CONFERENCISTA", empleado);
////		responsables_seis.put("MODERADOR", empleado_siete);
////		evento_seis.setResponsables(responsables_seis);
//
//		Evento evento_siete = new Evento(7, "Evento_siete", "......................", "20220701", "20221212", 20,
//				"Viernes de 16:00 a 20:00 y Sabado de 09:00 a 13:00", 25000.00, "DIPLOMADO", "PRESENCIAL");
////		Map<String, Empleado> responsables_siete = new HashMap<String, Empleado>();
////		responsables_siete.put("COORDINADOR", empleado_cinco);
////		responsables_siete.put("INSTRUCTOR", empleado_diez);
////		responsables_siete.put("INSTRUCTOR", empleado_dos);
////		responsables_siete.put("INSTRUCTOR", empleado_cuatro);
////		responsables_siete.put("INSTRUCTOR", empleado);
////		evento_siete.setResponsables(responsables_siete);
//
//		Evento evento_ocho = new Evento(8, "Evento_ocho", "......................", "20220201", "20220212", 9,
//				"Lunes, Miercoles y Viernes de 17:00 a 20:00", 500.00, "CONFERENCIA", "MIXTO");
////		Map<String, Empleado> responsables_ocho = new HashMap<String, Empleado>();
////		responsables_ocho.put("CONFERENCISTA", empleado);
////		responsables_ocho.put("CONFERENCISTA", empleado_dos);
////		responsables_ocho.put("CONFERENCISTA", empleado_tres);
////		responsables_ocho.put("CONFERENCISTA", empleado_cuatro);
////		responsables_ocho.put("MODERADOR", empleado_cinco);
////		evento_ocho.setResponsables(responsables_ocho);
//
//		Evento evento_nueve = new Evento(9, "Evento_nueve", "......................", "20220201", "20220212", 20,
//				"Lunes a Viernes de 08:00 a 10:00", 1500.00, "CURSO", "EN_LINEA");
////		Map<String, Empleado> responsables_nueve = new HashMap<String, Empleado>();
////		responsables_nueve.put("INSTRUCTOR", empleado_ocho);
////		responsables_nueve.put("INSTRUCTOR", empleado_nueve);
////		evento_nueve.setResponsables(responsables_nueve);
//
		eventos.add(evento);
//		eventos.add(evento_uno);
//		eventos.add(evento_dos);
//		eventos.add(evento_tres);
//		eventos.add(evento_cuatro);
//		eventos.add(evento_cinco);
//		eventos.add(evento_seis);
//		eventos.add(evento_siete);
//		eventos.add(evento_ocho);
//		eventos.add(evento_nueve);

		System.out.println("@!3  \neventos:" + eventos.size() + "\n" + eventos.toString());
		System.out.println("\ninteresados: " + interesados.size() + "\n" + interesados.toString());

	}

	public List<EventoEntity> getEventos() {
		return eventos;
	}

	public List<InteresadoEntity> getInteresados() {
		return interesados;
	}

	public List<EmpleadoEntity> getEmpleados() {
		return empleados;
	}

	//
	public boolean existe(Interesado interesado) {

		System.out.println("Existe? " + interesados.size());
		boolean existe = false;
		InteresadoEntity inter = interesados.stream().filter(i -> i.getUsuario().equals(interesado.getUsuario())
				&& i.getContrasenia().equals(interesado.getContrasenia())).findFirst().get();
		if (inter != null) {
			existe = true;
			System.out.println("\t***Si");
			interesado.setId(inter.getId());
			interesado.setNombres(inter.getNombres());
			interesado.setApellidos(inter.getApellidos());
		} else {
			System.out.println("\t***No");
		}
		return existe;

	}

	public boolean existe(Empleado empleado) {

		System.out.println("Existe? " + empleados.size());
		boolean existe = false;
		EmpleadoEntity empl = empleados.stream().filter(i -> i.getUsuario().equals(empleado.getUsuario())
				&& i.getContrasenia().equals(empleado.getContrasenia())).findFirst().get();
		if (empl != null) {
			existe = true;
			System.out.println("\t***Si");
			empleado.setId(empl.getId());
			empleado.setNombres(empl.getNombres());
			empleado.setApellidos(empl.getApellidos());
		} else {
			System.out.println("\t***No");
		}
		return existe;

	}

	public void registraInteresado(Interesado interesado) {
		System.out.println("registraInteresado " + interesados.size());

		InteresadoEntity entity = new InteresadoEntity();
		entity.setId(interesado.getId());
		entity.setNombres(interesado.getNombres());
		entity.setApellidos(interesado.getApellidos());
		entity.setUsuario(interesado.getUsuario());
		entity.setContrasenia(interesado.getContrasenia());

		interesados.add(entity);

		for (InteresadoEntity ie : interesados) {
			System.out.println(ie.toString() + "\n");

		}
		System.out.println("registraInteresado " + interesados.size());

	}

	public void registraEmpleado(Empleado empleado) {
		System.out.println("\nRegistraEmpleado " + empleados.size());

		EmpleadoEntity entity = new EmpleadoEntity();
		entity.setId(empleado.getId());
		entity.setNombres(empleado.getNombres());
		entity.setApellidos(empleado.getApellidos());
		entity.setUsuario(empleado.getUsuario());
		entity.setContrasenia(empleado.getContrasenia());

		empleados.add(entity);

		for (EmpleadoEntity ee : empleados) {
			System.out.println(ee.toString() + "\n");

		}
		System.out.println("\nRegistraEmpleado " + empleados.size());

	}

	public void registraEvento(Evento evento) {
		System.out.println("\nRegistraEvento " + eventos.size());

		EventoEntity entity = new EventoEntity();
		entity.setId(evento.getId());
		entity.setNombre(evento.getNombre());
		entity.setDescripcion(evento.getDescripcion());
		entity.setFecha_inicio(evento.getFecha_inicio());
		entity.setFecha_fin(evento.getFecha_inicio());
		entity.setDuracion(evento.getDuracion());
		entity.setPrecio(evento.getPrecio());
		entity.setTipoEvento(evento.getTipoEvento());
		entity.setModalidad(evento.getModalidad());

		eventos.add(entity);

		for (EventoEntity ee : eventos) {
			System.out.println(ee.toString() + "\n");

		}
		System.out.println("\nRegistraEmpleado " + eventos.size());

	}

}
