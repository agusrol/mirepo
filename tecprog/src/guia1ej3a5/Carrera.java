package guia1ej3a5;

import java.util.Vector;

/**
 * @author agusr
 * @version 1.0
 * @created 03-feb.-2021 16:45:23
 */
public class Carrera {

	private String nombre;
	private Vector<Alumno> alumnos;
	public Facultad m_Facultad;
	

	public Carrera(String nombre, Facultad m_Facultad) {
		super();
		this.nombre = nombre;
		this.m_Facultad = m_Facultad;
		this.m_Facultad.addCarrera(this);
		this.alumnos = new Vector<Alumno>();
	}

	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public void mostrarAlumnos(){
		
		for(Alumno a : this.alumnos){
			if(a==alumnos.get(0)) {
				System.out.println(a.toString());
			}
			else {
				System.out.println("	 "+a.toString());
			}
		}
	}

	public String toString(){
		return nombre;
	}
}//end Carrera
