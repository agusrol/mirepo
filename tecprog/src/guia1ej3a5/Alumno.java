package guia1ej3a5;
import java.util.Calendar;


/**
 * @author agusr
 * @version 1.0
 * @created 03-feb.-2021 16:45:21
 */
public class Alumno {

	private Calendar fecha_inscripcion;
	public Persona m_Persona;
	public Carrera m_Carrera;

	public Alumno(Calendar fecha_inscripcion, Persona p1, Carrera m_Carrera) {
		super();
		this.fecha_inscripcion = fecha_inscripcion;
		this.m_Persona = p1;
		this.m_Carrera = m_Carrera;
		this.m_Carrera.addAlumno(this);
	}

	private String verFechaIns() {
		int dia=this.fecha_inscripcion.get(Calendar.DAY_OF_MONTH);
		int mes=this.fecha_inscripcion.get(Calendar.MONTH);
		int anio=this.fecha_inscripcion.get(Calendar.YEAR);
		return dia+"/"+mes+"/"+anio;
	}
	public String toString() {
		return m_Persona.toString() + ", inscripcion " + verFechaIns() + " en " + m_Carrera.toString();
	}
}//end Alumno