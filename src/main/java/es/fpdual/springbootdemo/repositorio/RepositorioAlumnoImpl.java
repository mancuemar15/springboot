package es.fpdual.springbootdemo.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springbootdemo.modelo.Alumno;

@Repository
public class RepositorioAlumnoImpl implements RepositorioAlumno {

	private ArrayList<Alumno> listaAlumnos;
	{
		listaAlumnos = new ArrayList<>();

		listaAlumnos.add(new Alumno(1, "Juan"));
		listaAlumnos.add(new Alumno(2, "Carlos"));
	}

	@Override
	public List<Alumno> getAlumnos() {
		return this.listaAlumnos;
	}

	@Override
	public Alumno getAlumnoById(Integer id) {
		return listaAlumnos.stream().filter(alumno -> alumno.getId() == id).findFirst().orElse(null);
	}

	@Override
	public Alumno getAlumnoByNombre(String nombre) {
		return listaAlumnos.stream().filter(alumno -> nombre.equalsIgnoreCase(alumno.getNombre())).findFirst()
				.orElse(null);
	}

	@Override
	public void altaAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
	}

	@Override
	public Integer getSiguienteId() {
		return this.listaAlumnos.isEmpty() ? 1 : (this.listaAlumnos.get(listaAlumnos.size() - 1).getId() + 1);
	}

	@Override
	public void modificarAlumno(Alumno alumnoAModificar, Alumno alumnoNuevo) {
		listaAlumnos.set(listaAlumnos.indexOf(alumnoAModificar), alumnoNuevo);
	}

	@Override
	public void borrarAlumno(Integer id) {
		listaAlumnos.remove(this.getAlumnoById(id));
	}

}
