package guia2ej2;

import java.util.Calendar;

public abstract class Empleado {
	private Empresa empresa;
	public Empleado(Empresa e){
		empresa =e ;
		empresa.addEmpleado(this);
		
	}

	public abstract float calcRemunera(Calendar periodo);
}//end Empleado	