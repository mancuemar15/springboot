package es.fpdual.springbootdemo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fpdual.springbootdemo.modelo.Alumno;
import es.fpdual.springbootdemo.servicio.ServicioAlumno;

@RestController
public class ControladorAlumno {

	private ServicioAlumno servicioAlumno;

	@Autowired
	public ControladorAlumno(ServicioAlumno servicioAlumno) {
		this.servicioAlumno = servicioAlumno;
	}

	@GetMapping("/alumnos")
	public List<Alumno> getAlumnos() {
		return this.servicioAlumno.getAlumnos();
	}

	@GetMapping("/alumnos/id/{id}")
	public Alumno getAlumnoById(@PathVariable("id") Integer id) {
		return this.servicioAlumno.getAlumnoById(id);
	}

	@GetMapping("/alumnos/nombre/{nombre}")
	public Alumno getAlumnoByNombre(@PathVariable("nombre") String nombre) {
		return this.servicioAlumno.getAlumnoByNombre(nombre);
	}

	@PostMapping("/alumno")
	public void altaAlumno(@RequestBody AlumnoRequest alumnoRequest) {
		this.servicioAlumno.altaAlumno(new Alumno(alumnoRequest.getNombre()));
	}

	@PutMapping("/alumnos/{id}")
	public void modificarAlumno(@PathVariable("id") Integer idAlumnoAModificar,
			@RequestBody AlumnoRequest alumnoRequest) {
		this.servicioAlumno.modificarAlumno(idAlumnoAModificar, new Alumno(alumnoRequest.getNombre()));
	}

	@DeleteMapping("/alumnos/{id}")
	public void borrarAlumno(@PathVariable("id") Integer id) {
		this.servicioAlumno.borrarAlumno(id);
	}
}
