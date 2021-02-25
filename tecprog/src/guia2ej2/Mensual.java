package guia2ej2;

import java.util.Calendar;

public class Mensual extends Empleado {

	private String cat;
	private  Jefe m_Jefe;

	public Mensual(String cat, Jefe jefe, Empresa e){
		super(e);
		this.cat = cat;
		this.m_Jefe=jefe;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float calcRemunera(Calendar periodo){
		float sueldo=-1;
		if(cat=="A") {
			sueldo=100;
		}else if(cat=="B") {
			sueldo=140;
		}else if(cat=="C") {
			sueldo=200;
		}
		return sueldo;
	}
}//end Mensual
