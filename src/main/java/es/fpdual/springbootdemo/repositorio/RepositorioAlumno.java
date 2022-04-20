package es.fpdual.springbootdemo.repositorio;

import java.util.List;

import es.fpdual.springbootdemo.modelo.Alumno;

public interface RepositorioAlumno {

	public List<Alumno> getAlumnos();

	public Alumno getAlumnoById(Integer id);

	public Alumno getAlumnoByNombre(String nombre);

	public void altaAlumno(Alumno alumno);

	public Integer getSiguienteId();

	public void modificarAlumno(Alumno alumnoAModificar, Alumno alumnoNuevo);

	public void borrarAlumno(Integer id);
}
