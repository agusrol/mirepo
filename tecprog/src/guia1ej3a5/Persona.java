package guia1ej3a5;
import java.util.Calendar;

/**
 * @author agusr
 * @version 1.0
 * @created 03-feb.-2021 15:58:53
 */
public class Persona {

	private int documento;
	private String nombre;
	private Calendar fecha_nacimiento;
	private String pass;

	public Persona(int documento, String nombre, Calendar fecha_nacimiento,String pass) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.pass=pass;
	}

	public void mostrar(){
		System.out.println(toString());
	}
	
	public int calcularEdad(){
		return 0;
	}
	private String verFechaNac() {
		int dia=this.fecha_nacimiento.get(Calendar.DAY_OF_MONTH);
		int mes=this.fecha_nacimiento.get(Calendar.MONTH);
		int anio=this.fecha_nacimiento.get(Calendar.YEAR);
		return dia+"/"+mes+"/"+anio;
	}
	private String verPass() {
		String cad="";
		for (int i = 0; i < pass.length(); i++) {
			cad+="*";
		}
		return cad;
	}
	public boolean validar(String prueba) {
		return prueba==pass;
	}
	public String toString(){
		return nombre + ", DNI " + documento + ", nacimiento " + verFechaNac()+" pass: "+verPass();
	}
}//end Persona