package guia2ej2;

import java.util.Calendar;
import java.util.Vector;

public class Jornalizado extends Empleado {

	private Jefe m_Jefe;
	private Vector<HorasPeriodo>horasPeriodos;

	public Jornalizado(Jefe m_Jefe, Empresa e) {
		super(e);
		this.m_Jefe = m_Jefe;
		this.horasPeriodos = new Vector<HorasPeriodo>();
	}
	public void addHorasPeriodo(HorasPeriodo hp) {
		horasPeriodos.add(hp);
	}
	public void addHorasPeriodo(int horas, Calendar periodo) {
		HorasPeriodo hp = new HorasPeriodo(horas,this,periodo);
	}
	private float calcRemuneraHoras(int horas) {
		float sueldo = -1;
		float precioHoraHasta40 = 10;
		float precioHoraExtra = 20;
		if(horas<=40) {
			sueldo = horas*precioHoraHasta40;
		}else
			sueldo = ((horas-40)*precioHoraExtra +40*precioHoraHasta40);
		return sueldo;
	}
	public float calcRemunera(Calendar periodo){
		int horas = -1;
		for (HorasPeriodo hp : horasPeriodos) {
			horas = hp.getHoras(periodo);
		}
		return calcRemuneraHoras(horas);
	}
}//end Jornalizado