package es.fpdual.springbootdemo.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import es.fpdual.springbootdemo.modelo.Alumno;
import es.fpdual.springbootdemo.repositorio.RepositorioAlumno;

@Service
public class ServicioAlumnoImpl implements ServicioAlumno {

	private RepositorioAlumno repositorio;

	public ServicioAlumnoImpl(RepositorioAlumno repositorioAlumno) {
		super();
		this.repositorio = repositorioAlumno;
	}

	@Override
	public List<Alumno> getAlumnos() {
		return this.repositorio.getAlumnos();
	}

	@Override
	public Alumno getAlumnoById(Integer id) {
		return this.repositorio.getAlumnoById(id);
	}

	@Override
	public Alumno getAlumnoByNombre(String nombre) {
		return this.repositorio.getAlumnoByNombre(nombre);
	}

	@Override
	public void altaAlumno(Alumno alumno) {
		final Alumno alumnoAInsertar = new Alumno(this.repositorio.getSiguienteId(), alumno.getNombre());
		this.repositorio.altaAlumno(alumnoAInsertar);
	}

	@Override
	public void modificarAlumno(Integer idAlumnoAModificar, Alumno alumnoNuevo) {
		final Alumno alumnoAModificar = this.repositorio.getAlumnoById(idAlumnoAModificar);
		if (alumnoAModificar != null) {
			alumnoNuevo.setId(idAlumnoAModificar);
			this.repositorio.modificarAlumno(alumnoAModificar, alumnoNuevo);
		}
	}

	@Override
	public void borrarAlumno(Integer id) {
		this.repositorio.borrarAlumno(id);

	}

}
