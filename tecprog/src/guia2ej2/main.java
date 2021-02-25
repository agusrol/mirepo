package guia2ej2;

import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2015, 1, 3);
		Calendar fecha2 = Calendar.getInstance();
		fecha2.set(2015, 2, 8);
		Calendar fecha3 = Calendar.getInstance();
		fecha3.set(2015, 3, 3);
		Calendar fecha4 = Calendar.getInstance();
		fecha4.set(2015, 4, 8);
		Empresa e = new Empresa();
		
		Jefe j1 = new Jefe(100,e);
		Mensual m1 = new Mensual("A",j1,e);
		Jornalizado jo1 = new Jornalizado(j1,e);
		jo1.addHorasPeriodo(45, fecha1);
		System.out.println("Remunerado: " + e.calcRemunera(fecha1));
	}

}
