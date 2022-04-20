package es.fpdual.springbootdemo.controlador;

public class AlumnoRequest {

	private String nombre;

	public AlumnoRequest(String nombre) {
		super();
		this.nombre = nombre;
	}

	public AlumnoRequest() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
