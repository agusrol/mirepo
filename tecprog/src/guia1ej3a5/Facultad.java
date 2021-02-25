package guia1ej3a5;
import java.util.Vector;

/**
 * @author agusr
 * @version 1.0
 * @created 03-feb.-2021 16:45:24
 */
public class Facultad {
	
	private String nombre;
	private Vector<Carrera> carreras;
	
	public Facultad(String nombre) {
		super();
		this.nombre = nombre;
		this.carreras = new Vector<Carrera>();
	}
	
	public void addCarrera(Carrera c) {
		carreras.add(c);
	}
	
	public void mostrarCarrerasyAlumnos(){
		System.out.println("Facultad: " + nombre);		
		for(Carrera c : this.carreras){
			System.out.print("Carrera: ");
			System.out.print(c.toString());
			System.out.print("\nAlumnos: ");
			c.mostrarAlumnos();
		}
		
		
	}

	public String toString(){
		return "";
	}
}//end Facultad