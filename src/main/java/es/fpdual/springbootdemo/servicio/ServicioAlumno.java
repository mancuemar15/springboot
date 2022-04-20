package es.fpdual.springbootdemo.servicio;

import java.util.List;

import es.fpdual.springbootdemo.modelo.Alumno;

public interface ServicioAlumno {

	public List<Alumno> getAlumnos();

	public Alumno getAlumnoById(Integer id);

	public Alumno getAlumnoByNombre(String nombre);

	public void altaAlumno(Alumno alumno);

	public void modificarAlumno(Integer idAlumnoAModificar, Alumno nuevoAlumno);

	public void borrarAlumno(Integer id);
}
