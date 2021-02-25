package guia2ej2;
import java.util.Calendar;
public class HorasPeriodo {
	int horas;
	private Jornalizado jornalizado;
	Calendar periodo;
	public int getHoras(Calendar periodo) {
		int h = -1;
		if(periodo==this.periodo)
			h=horas;
		return horas;
	}
	
	public void setPeriodo(Calendar periodo) {
		this.periodo = periodo;
	}
	public HorasPeriodo(int horas, Jornalizado j, Calendar periodo) {
		super();
		this.jornalizado = j;
		j.addHorasPeriodo(this);
		this.horas = horas;
		this.periodo = periodo;
	}
	public boolean esPeriodo(Calendar periodo) {
		int diap,mesp,aniop;
		diap = periodo.get(Calendar.DAY_OF_MONTH);
		mesp = periodo.get(Calendar.MONTH);
		aniop = periodo.get(Calendar.YEAR);
		int dia,mes,anio;
		dia = this.periodo.get(Calendar.DAY_OF_MONTH);
		mes = this.periodo.get(Calendar.MONTH);
		anio = this.periodo.get(Calendar.YEAR);
		return dia==diap&&mesp==mes&&aniop==anio;
	}
}
