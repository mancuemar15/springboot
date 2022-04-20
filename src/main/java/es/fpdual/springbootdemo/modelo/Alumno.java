package es.fpdual.springbootdemo.modelo;

public class Alumno {

	private Integer id;
	private String nombre;

	public Alumno(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Alumno() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
