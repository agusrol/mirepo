package guia2ej2;

import java.util.Calendar;

public class Jefe extends Empleado {

	float sueldoFijo;
	
	public Jefe(float sueldoFijo, Empresa e) {
		super(e);
		this.sueldoFijo = sueldoFijo;
	}

	public float calcRemunera(Calendar periodo){
		return sueldoFijo;
	}
}//end Jefe
