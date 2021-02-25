package guia2ej2;

import java.util.Calendar;
import java.util.Vector;

public class Empresa {

	private Vector<Empleado>empleados;

	public Empresa(){
		this.empleados=new Vector<Empleado>();
	}
	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	public int calcRemunera(Calendar periodo){
		int totRemu = 0;
		for (Empleado empleado : empleados) {
			totRemu+=empleado.calcRemunera(periodo);
		}
		return totRemu;
	}
}//end Empresa