package guia1;

import java.util.Calendar;

/**
 * @author agusr
 * @version 1.0
 * @created 03-feb.-2021 15:58:53
 */
public class Persona {

	private int documento;
	private String nombre;
	private Calendar fechaNac;
	public Persona(int documento, String nombre, Calendar fechaNac) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public Persona(){

	}
	
	public int calcEdad() {
		Calendar hoy = Calendar.getInstance();		
		int edad =  yaCumplio() ? 
				hoy.get(Calendar.YEAR)-fechaNac.get(Calendar.YEAR):
				hoy.get(Calendar.YEAR)-fechaNac.get(Calendar.YEAR)-1; 
		return edad;
	}
	
	private boolean yaCumplio() {
		Calendar hoy = Calendar.getInstance();		
		boolean yaCumplio =
				fechaNac.get(Calendar.MONTH) < hoy.get(Calendar.MONTH) ||
				(fechaNac.get(Calendar.MONTH) == hoy.get(Calendar.MONTH)) &&
				(fechaNac.get(Calendar.DAY_OF_MONTH)<=hoy.get(Calendar.DAY_OF_MONTH));
		return yaCumplio;
	}
	
	public String mostrar(){
		return this.nombre + "," + this.documento;
	}
	
}//end Persona