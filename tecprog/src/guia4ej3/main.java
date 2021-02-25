package guia4ej3;

import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar f1= Calendar.getInstance();
		f1.set(2020, 1, 14);
		Calendar hoy = Calendar.getInstance();
		diasEntreFechas(f1,hoy);
	}
	public static int diasEntreFechas(Calendar f1, Calendar f2) {
		int dias = f2.get(Calendar.DAY_OF_YEAR)-f1.get(Calendar.DAY_OF_YEAR)+1;//+1 por []
		System.out.println(dias);
		Calendar cuentaAnios =  Calendar.getInstance();
		cuentaAnios.setTime(f1.getTime());
		for(;cuentaAnios.get(Calendar.YEAR)<f2.get(Calendar.YEAR);cuentaAnios.add(Calendar.YEAR, 1)) {
			System.out.println("sumo " + cuentaAnios.getActualMaximum(Calendar.DAY_OF_YEAR));
			dias+=cuentaAnios.getActualMaximum(Calendar.DAY_OF_YEAR);
		}
		System.out.println(dias);
		return 3;
	}
}
